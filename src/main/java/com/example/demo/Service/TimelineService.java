package com.example.demo.Service;

import com.example.demo.Entity.Book;
import com.example.demo.Entity.Timeline;

import java.util.List;

public interface TimelineService {
    List<Timeline> getALlTimeline();

    void addTimeLine(Timeline timeline);

    void deleteTimeline(int id);

}
