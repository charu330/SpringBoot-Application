package springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot.topics.Topic;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id)
    {
          return courseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicid}/courses/{id}")
    public Course getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }

    @RequestMapping(method=RequestMethod.POST, value= "/topics/{topicid}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicid) {
        course.setTopic(new Topic(topicid, "", ""));
        courseService.addCourse(course);

    }
    @RequestMapping(method = RequestMethod.PUT, value= "/topics/{topicid}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicid, @PathVariable String id)
    {
        course.setTopic(new Topic(topicid, "", ""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/courses/{id}")
    public void deleteCourse(@PathVariable String id)
    {
         courseService.deleteCourse(id);
    }
}
