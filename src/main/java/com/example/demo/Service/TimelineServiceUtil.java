package com.example.demo.Service;

import com.example.demo.Entity.Timeline;
import com.example.demo.Repository.TimelineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimelineServiceUtil implements TimelineService {


    final TimelineRepository timelineRepository;

    public TimelineServiceUtil(TimelineRepository timelineRepository) {
        this.timelineRepository = timelineRepository;
    }


    @Override
    public List<Timeline> getALlTimeline() {
        return timelineRepository.findAll();
    }

    @Override
    public void addTimeLine(Timeline timeline) {
        timelineRepository.save(timeline);
    }


    @Override
    public void deleteTimeline(int id) {
        timelineRepository.deleteById(id);
    }
}
