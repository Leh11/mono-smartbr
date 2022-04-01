package com.bioksam.smarbr;

import jakarta.faces.view.ViewScoped;
import org.primefaces.model.ResponsiveOption;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class CarouselView implements Serializable {

    private List<Product> products;

    private List<ResponsiveOption> responsiveOptions;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.getProducts(12);
        responsiveOptions = new ArrayList<>();
        responsiveOptions.add(new ResponsiveOption("1024px", 4, 4));
        responsiveOptions.add(new ResponsiveOption("880px", 3, 3));
        responsiveOptions.add(new ResponsiveOption("622px", 2, 2));
        responsiveOptions.add(new ResponsiveOption("560px", 1, 1));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setService(ProductService service) {
        this.service = service;
    }
    public List<ResponsiveOption> getResponsiveOptions() {
        return responsiveOptions;
    }

    public void setResponsiveOptions(List<ResponsiveOption> responsiveOptions) {
        this.responsiveOptions = responsiveOptions;
    }
}