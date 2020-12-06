package com.lifemanagement.dev.tab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tabs")
public class TabController {
    @Autowired
    private TabRepository tabRepository;

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public Iterable<Tab> getAllTabs(@RequestParam Integer id) {
        return tabRepository.findBySectionId(id);
    }
}