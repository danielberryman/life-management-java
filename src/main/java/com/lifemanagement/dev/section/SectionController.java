package com.lifemanagement.dev.section;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sections")
public class SectionController {
    @Autowired
    private SectionRepository sectionRepository;

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public @ResponseBody Iterable<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public Section addSection(@RequestParam String title) {
        Section s = new Section();
        s.setTitle(title);
        return sectionRepository.save(s);
    }
}