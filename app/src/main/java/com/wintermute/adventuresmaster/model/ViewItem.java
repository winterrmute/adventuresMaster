package com.wintermute.adventuresmaster.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ViewItem
{
    private String label;
    private List<String> subLabels;
    private Long id;
}