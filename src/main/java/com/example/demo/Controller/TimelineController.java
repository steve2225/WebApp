package com.example.demo.Controller;

import com.example.demo.Entity.Timeline;
import com.example.demo.Service.BookService;
import com.example.demo.Service.StudentService;
import com.example.demo.Service.TimelineService;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/timelines")
public class TimelineController {

    BookService bookService;

    StudentService studentService;

    TimelineService timelineService;

    public TimelineController(BookService bookService, StudentService studentService, TimelineService timelineService){
        this.bookService=bookService;
        this.studentService=studentService;
        this.timelineService=timelineService;
    }

    @GetMapping("/list")
    public String getAllRecords(Model theModel){
        List<Timeline> theTimeline=timelineService.getALlTimeline();
        theModel.addAttribute("timelines", theTimeline);
        return "list-timelines";
    }

    @GetMapping("formAdd")
    public String fromForAdd(Model theModel){
        Timeline theTimeline=new Timeline();
        theModel.addAttribute("timelines", theTimeline);
        return "timeline-form";
    }
    @PostMapping("/save")
    public String saveTimeline(@ModelAttribute("timelines") Timeline theTimeline){
        timelineService.addTimeLine(theTimeline);
        return "redirect:/timelines/list";
    }

    @GetMapping("/delete")
    public String deleteTimeline(@RequestParam("timelineId") int id){
        timelineService.deleteTimeline(id);
        return "redirect:/timelines/list";
    }
}
