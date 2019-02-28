package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.models.Menu;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    public Menu getMenu() {

        return new Menu();
    }
}
