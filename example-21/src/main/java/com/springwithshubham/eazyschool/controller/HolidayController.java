package com.springwithshubham.eazyschool.controller;

import com.springwithshubham.eazyschool.Model.Holiday;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class HolidayController {

    @GetMapping("/holidays")
    public String displayHolidays(Model model){
        List<Holiday> holidays = Arrays.asList(
          new Holiday("Jan 1", "New Year's Day", Holiday.Type.FESTIVAL),
          new Holiday("Jan 14", "Makar Sankrat", Holiday.Type.FESTIVAL),
          new Holiday("Jan 26", "Republic Day", Holiday.Type.FEDERAL),
          new Holiday("Feb 14", "Black Day", Holiday.Type.FEDERAL),
          new Holiday("Feb 19", "Shiv Jayanti", Holiday.Type.FESTIVAL),
          new Holiday("March 6", "Shiv-Ratri", Holiday.Type.FESTIVAL),
          new Holiday("May 1", "Labour Day", Holiday.Type.FEDERAL)
        );

        Holiday.Type[] types = Holiday.Type.values();

        for(Holiday.Type type: types){
            model.addAttribute(type.toString(),
                    (holidays.stream().filter(holiday -> holiday.getType().equals(type)).collect(Collectors.toList())));
        }

        return "holidays.html";
    }

}
