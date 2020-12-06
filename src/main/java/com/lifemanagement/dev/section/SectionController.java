package com.lifemanagement.dev.section;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectionController {
    @Autowired
    private SectionRepository sectionRepository;

    @RequestMapping(value="/sections/all", method=RequestMethod.GET)
    public @ResponseBody Iterable<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    @RequestMapping(value="/sections/add", method=RequestMethod.POST)
    public Section addSection(@RequestParam String title) {
        Section s = new Section();
        s.setTitle(title);
        return sectionRepository.save(s);
    }

    @DeleteMapping("/sections/{id}")
    public void deleteSection(@PathVariable Integer id) {
        sectionRepository.deleteById(id);
    }
}