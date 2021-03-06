package com.evgen.timetable.model.dto.timeTable;

import java.util.Set;

import javax.validation.constraints.NotNull;

import com.evgen.timetable.model.name.TimeTableName;
import com.evgen.timetable.model.dto.workDay.WorkDayRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimeTableRequest {

  @NotNull
  private TimeTableName timeTableName;

  @NotNull
  private String groupName;

  @NotNull
  private Set<WorkDayRequest> workDays;

}