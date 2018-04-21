using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using API.Model;

namespace api.Controllers
{
    [Route("api/[controller]/[action]")]
    public class UserController : Controller
    {
        private readonly Context _context;
        
        public UserController(Context context) {
            _context = context;
        }

        // GET api/user/getall
        [HttpGet]
        public IEnumerable<User> GetAll()
        {
            return _context.Users.ToList();
        }

        // GET api/user/getuser/5
        [HttpGet("{id}")]
        public IActionResult GetById(string id)
        {
            var users = _context.Users.FirstOrDefault(t => t.Id == id);
            if (users == null) {
                return NotFound();
            }
            return new ObjectResult(users);
        }
    }
}
