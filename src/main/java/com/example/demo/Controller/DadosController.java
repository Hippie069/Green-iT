package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.Model.Dados;
import com.example.demo.Model.equipamentos;
import com.example.demo.Service.DadosService;
import com.example.demo.Service.equipamentosService;

@Controller
@RequestMapping("/home")
public class DadosController {

    @Autowired
    private DadosService ds;

    @Autowired
    private equipamentosService es;

    @GetMapping("/dados")

    public ModelAndView coleta(){
        ModelAndView mv = new ModelAndView("dados");
        es.geteEquipamentos();
        mv.addObject("dados", new Dados());
        mv.addObject("Dados", ds.getTodosDados());
        return mv;
    }

    @PostMapping("/salvarcoleta")
    public String coletaView(@ModelAttribute Dados Dados){
        
        ds.addDados(Dados);

        return "redirect:/home/dados";
    }

    @GetMapping("/amostra/{ID}")
    public ModelAndView detalhes(@PathVariable (name="ID") Integer id){
        ModelAndView mv = new ModelAndView("amostra");

        Dados dados = ds.getDadosById(id);

        equipamentos equip1 = es.getEquipamentosById(1);
        equipamentos equip2 = es.getEquipamentosById(2);

        

        dados.setResultCusto(ds.calculo(dados, equip1)) ;

        dados.setEnergiaTotal(ds.calcEnergiaTotal(dados, equip1));

        dados.setPrecoTotal(ds.calcGastoTotal(dados, equip1));

        dados.setResultEnergia(ds.calcEnergia(dados, equip1, equip2));

        dados.setResultPreco(ds.calcGasto(dados, equip1, equip2));

        mv.addObject("Dados", dados);

        return mv;
    }

}
