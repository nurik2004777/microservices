package domain

import java.util.Date

case class Course(
                 courseid: Int,
                 name:String,
                 userids: List[Int],
                 enrollmentdate:Date
               )

case class CourseUpdate(
                   courseid: Option[Int] = None,
                   name: Option[String] = None,
                   userids: Option[List[Int]] = None,
                   enrollmentdate: Option[Date] = None
                 )