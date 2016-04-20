using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;

[WebService(Namespace = "http://tempuri.org/" , 
Description="SPSU Computer Related Degree Web Service",
Name="SPSUDegreeDetailWebService")]
[WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
// To allow this Web Service to be called from script, using ASP.NET AJAX, uncomment the following line. 
// [System.Web.Script.Services.ScriptService]

public class Service : System.Web.Services.WebService
{
    public Service () {

        //Uncomment the following line if using designed components 
        //InitializeComponent(); 
    }

    [WebMethod]
    public string CSBA() {
        return "As preparation for diverse employment opportunities, \nthe Computer Science program offers a wide range of Mathematics and Computer Science courses, \nsuch as Programming Language Concepts, Data Structures, and Algorithm Analysis. \nStudents may elect to earn a Bachelor of Science degree in Computer Science, \nwhich offers a mix of rigor and exposure to current technologies, \nor the Bachelor of Arts in Computer Science, which offers flexibility, e.g., \nwith a minor in one additional area of study. For student convenience, \nmany classes are offered in the evenings, especially as students \nmake progress toward graduation.";
    }
    [WebMethod]
    public string CSBS() {
        return "As preparation for diverse employment opportunities, the Computer Science program offers a wide range of Mathematics and Computer Science courses, such as Programming Language Concepts, Data Structures, and Algorithm Analysis. Students may elect to earn a Bachelor of Science degree in Computer Science, which offers a mix of rigor and exposure to current technologies, or the Bachelor of Arts in Computer Science, which offers flexibility, e.g., with a minor in one additional area of study. For student convenience, many classes are offered in the evenings, especially as students make progress toward graduation.";
    }
    [WebMethod]
    public string CETBS() {
        return "Engineering Technology is a branch of engineering education that emphasizes the practical aspects of engineering rather than abstract concepts or theories. It is a blend of the application of science, engineering knowledge, and technical skills used in support of engineering activities. The development of the microcomputer has created a need for engineering technologists with a specialized knowledge of computers and control systems. The bachelor degree in computer engineering technology was created to meet this need.";
    }
    [WebMethod]
    public string ITBS() {
        return "The Bachelor of Science in Information Technology (BSIT) degree has the primary objective of meeting the high demand for professional degrees in the strategy, development, and administration of integrated computing, management, and information technology systems. This offering is targeted at the metro Atlanta region, and will serve those students interested in combining computer science, management, and information technology curricula.";
    }
    [WebMethod]
    public string SWEBS() {
        return "Software engineering represents the fastest growing segment of software professionals -- men and women who solve problems and issues in the development and engineering of mission-critical software systems to meet the requirements of business and industry in a reliable, secure, timely, and cost-effective manner. At Southern Polytechnic, our Software Engineering students learn real-time strategies and procedures that will give them a competitive edge in the market. Coursework includes software design techniques, software quality, software project management, and electives such as component-based software, embedded systems design, game design, etc. This is the only Software Engineering program at the undergraduate level in Georgia and one of the few in the nation.";
    }


    [WebMethod]
    public string CSMS() {
        return "Whether you have a degree in computer science, no background in computer science, some academic experience in the field to your credit, or years of work as a computer professional under your belt, a Master of Science in Computer Science from Southern Polytechnic will enhance your career options. We provide the background necessary to analyze problems from multiple angles, and the resources to conduct research and complete projects while you are learning. Classes are available in the evenings to accommodate the needs of the working professional";
    }
    [WebMethod]
    public string ITMS() {
        return "The Master of Science in Information Technology (MSIT) program is designed for those students interested in pursuing a career as a senior information technology (IT) professional who can apply accepted standards and best practices to effectively plan, design, implement and manage the various aspects of an IT organization. Although no specific undergraduate major is required, applicants must have a baccalaureate degree from an accredited school. Students will be evaluated on an individual basis and will be admitted only if their academic accomplishments, recommendations, and motivation predict the ability to complete the program successfully.";
    }
    [WebMethod]
    public string SWEMS() {
        return "The Master of Science in Software Engineering Program is designed both for full-time students and for working professionals who want to earn a professional degree part-time in the evening. We are also offering an increasing number of courses online, and it will be possible to complete the degree fully online. Students must have at least a bachelor's degree to apply.";
    }


    
}