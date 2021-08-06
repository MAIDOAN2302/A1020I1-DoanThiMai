package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.*;
import vn.codegym.service.attachService.AttachServiceService;
import vn.codegym.service.contractDetail.ContractDetailService;
import vn.codegym.service.contract.ContractService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/contractDetail")
public class ContractDetailController {

    @Autowired
    ContractDetailService contractDetailService;

    @Autowired
    ContractService contractService;

    @Autowired
    AttachServiceService attachServiceService;

    @ModelAttribute("listContract")
    public List<Contract> contractList(){
        return contractService.findAll();
    }
    @ModelAttribute("listAttachService")
    public List<AttachService> attachServiceList(){
        return attachServiceService.findAll();
    }
    @GetMapping("/list")
    public String showListContractDetail(@RequestParam(defaultValue = "0") int page, Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<ContractDetail> contractsDetail = contractDetailService.findAll(pageable);
        model.addAttribute("contractsDetails", contractsDetail);
        return "contractDetail/list";
    }

    @GetMapping("/create")
    public String showFormCreateContract(Model model) {
        model.addAttribute("contractDetail", new ContractDetail());
        model.addAttribute("contract", new Contract());
        model.addAttribute("attachService", new AttachService());
        return "contractDetail/create";
    }

    @PostMapping("/save")
    public String saveCreatedContract(@Valid @ModelAttribute ContractDetail contractDetail, BindingResult bindingResult, Model model) {
        if (contractDetailService.existById(contractDetail.getId())) {
            model.addAttribute("contractDetail", contractDetail);
            model.addAttribute("error", "ID đã tồn tại!");
            return "contractDetail/create";
        }
        if (bindingResult.hasErrors()) {
            model.addAttribute("contractDetail", contractDetail);
            return "contractDetail/create";
        }
        contractDetailService.save(contractDetail);
        return "redirect:/contractDetail/list";
    }
}
