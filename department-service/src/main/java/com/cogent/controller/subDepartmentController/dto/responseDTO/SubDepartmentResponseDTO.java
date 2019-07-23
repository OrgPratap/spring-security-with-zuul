package com.cogent.controller.subDepartmentController.dto.responseDTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * @author Sauravi
 */


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel
public class SubDepartmentResponseDTO implements Serializable {

    @ApiModelProperty(value = "Sub-Department id i.e. auto generated by database")
    private Long id;

    @ApiModelProperty(value = "Department id i.e. auto generated by database")
    private Long departmentId;

    @ApiModelProperty(value = "Sub-Department  name should be unique")
    private String name;

    @ApiModelProperty(value = "Sub-Department  Code should be unique")
    private String code;

    @ApiModelProperty(value = "Y, N and D are only used")
    private Character status;



}