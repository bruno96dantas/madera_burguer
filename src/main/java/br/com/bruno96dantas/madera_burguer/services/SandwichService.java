package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.converters.SandwichConvert;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import br.com.bruno96dantas.madera_burguer.repositories.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SandwichService {

    @Autowired
    private SandwichRepository sandwichRepository;

    @Autowired
    private SandwichConvert sandwichConvert;

    public List<SandwichDto> selectAll() {

        List<Sandwich> sandwichList = sandwichRepository.findAll();

        return sandwichList.stream()
                .map(sandwich -> sandwichConvert.unCovert(sandwich))
                .collect(Collectors.toList());
    }
}
