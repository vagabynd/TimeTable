package com.evgen.timetable.model.dto.group;

import java.util.Set;

import com.evgen.timetable.model.dto.user.UserResponse;

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
public class GroupWithStudentsResponse {

  private String groupId;
  private String groupName;
  private Set<UserResponse> students;

}