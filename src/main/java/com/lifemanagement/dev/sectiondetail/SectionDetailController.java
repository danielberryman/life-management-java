package com.lifemanagement.dev.sectiondetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sectiondetails")
public class SectionDetailController {
    @Autowired
    private SectionDetailRepository sectionDetailRepository;

    @RequestMapping(value="/all", method=RequestMethod.GET)
    public Iterable<SectionDetail> getAllSectionDetails() {
        return sectionDetailRepository.findAll();
    }

}