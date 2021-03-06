package com.evgen.timetable.model.dto.timeTable;

import java.util.Set;

import com.evgen.timetable.model.name.TimeTableName;
import com.evgen.timetable.model.dto.workDay.WorkDayResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class TimeTableResponse {

  private String timeTableId;
  private TimeTableName timeTableName;
  private Set<WorkDayResponse> workDays;

}