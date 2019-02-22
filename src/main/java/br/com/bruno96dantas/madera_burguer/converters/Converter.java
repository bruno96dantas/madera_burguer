package br.com.bruno96dantas.madera_burguer.converters;

public interface Converter<model, dto> {

    model convert(dto dto);

    dto unCovert(model model);
}
