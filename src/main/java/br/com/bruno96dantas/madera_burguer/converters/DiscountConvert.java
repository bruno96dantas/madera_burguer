//package br.com.bruno96dantas.madera_burguer.converters;
//
//import br.com.bruno96dantas.madera_burguer.dto.DiscountDto;
//import br.com.bruno96dantas.madera_burguer.models.promotion.Discount;
//import org.springframework.stereotype.Component;
//
//@Component
//public class DiscountConvert implements Converter<Discount, DiscountDto> {
//
//    @Override
//    public Discount convert(DiscountDto discountDto) {
//        return Discount.builder()
//                .sandwich(discountDto.getSandwich())
//                .build();
//    }
//
//    @Override
//    public DiscountDto unConvert(Discount discount) {
//        return DiscountDto.builder()
//                .sandwich(discount.getSandwich())
//                .valueWithDiscount(discount.getDiscount())
//                .build();
//    }
//}
