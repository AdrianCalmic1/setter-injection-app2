package pixel.academy.setter_injection_app.common;

import org.springframework.stereotype.Component;


@Component
    public class MexicanChef implements Chef {

        @Override
        public String getDailyRecipe() {
            return "Estoy cocinando carne de res guisada con verduras.";

        }
    }
