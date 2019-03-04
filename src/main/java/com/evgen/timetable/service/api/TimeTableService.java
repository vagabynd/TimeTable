package com.evgen.timetable.service.api;

import com.evgen.timetable.model.timeTable.TimeTableRequest;
import com.evgen.timetable.model.timeTable.TimeTableResponse;

public interface TimeTableService {

  TimeTableResponse getTimeTableById(Long id);

  TimeTableResponse addTimeTable(TimeTableRequest timeTableRequest);

  void deleteTimeTableById(Long id);

  void updateTimeTableById(Long id, TimeTableRequest timeTableRequest);

}