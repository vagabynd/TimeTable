package com.evgen.timetable.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.evgen.timetable.model.dto.workDay.WorkDayResponse;
import com.evgen.timetable.model.entity.WorkDay;

@Mapper(componentModel = "spring", uses = LessonDayMapper.class)
public interface WorkDayMapper {

  @Mapping(target = "workDayId", source = "id")
  WorkDayResponse workDaySetToWorkDayResponse(WorkDay workDay);

//  WorkDay workDayRequestToWorkDay(WorkDayRequest workDayRequest,
//      @Context TeacherRepository teacherRepository,
//      @Context LessonRepository lessonRepository);

}