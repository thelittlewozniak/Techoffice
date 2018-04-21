using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Reflection.Emit;
using System.Text;
using System.Threading.Tasks;
using Emgu.CV;
namespace LittleSister
{
    class Program
    {
        static void Main(string[] args)
        {
            VideoCapture videoCapture = new VideoCapture(0);
            videoCapture.Start();
            Console.WriteLine(videoCapture.CaptureSource);
            while (true)
            {
                videoCapture.ImageGrabbed += VideoCapture_ImageGrabbed;
            }
        }

        private static void VideoCapture_ImageGrabbed(object sender, EventArgs e)
        {
            Console.WriteLine("reussi");
            VideoCapture capture = (VideoCapture)sender;
            //capture.Grab();
            Mat image=new Mat();
            capture.Retrieve(image,0);
            
            
        }
    }
}
