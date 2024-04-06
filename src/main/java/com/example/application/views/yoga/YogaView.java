package com.example.application.views.yoga;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Yoga")
@Route(value = "my-Yoga", layout = MainLayout.class)
@Uses(Icon.class)
public class YogaView extends Composite<VerticalLayout> {

    public YogaView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H2 h2 = new H2();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        Paragraph textSmall = new Paragraph();
        VerticalLayout layoutColumn5 = new VerticalLayout();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        VerticalLayout layoutColumn6 = new VerticalLayout();
        VerticalLayout layoutColumn4 = new VerticalLayout();
        Button buttonPrimary = new Button();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button buttonPrimary2 = new Button();
        Button buttonPrimary3 = new Button();
        Button buttonPrimary4 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("1014px");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h2.setText("Heading");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h2);
        h2.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("200px");
        layoutColumn2.setHeight("151px");
        textSmall.setText(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        textSmall.setWidth("100%");
        textSmall.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        layoutColumn5.setWidth("474px");
        layoutColumn5.setHeight("344px");
        layoutColumn3.setWidth("320px");
        layoutColumn3.setHeight("344px");
        layoutColumn6.setWidth("300px");
        layoutColumn6.setHeight("200px");
        layoutColumn4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.setHeight("30px");
        layoutColumn4.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn4.setAlignItems(Alignment.CENTER);
        buttonPrimary.setText("More Yoga");
        layoutColumn4.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow3.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("300px");
        layoutRow3.setHeight("74px");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);
        buttonPrimary2.setText("Previous");
        buttonPrimary2.setWidth("min-content");
        buttonPrimary2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary3.setText("Start");
        buttonPrimary3.setWidth("min-content");
        buttonPrimary3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonPrimary4.setText("Next");
        layoutRow3.setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary4);
        buttonPrimary4.setWidth("min-content");
        buttonPrimary4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutColumn2);
        layoutColumn2.add(textSmall);
        layoutRow2.add(layoutColumn5);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(layoutColumn6);
        layoutColumn3.add(layoutColumn4);
        layoutColumn4.add(buttonPrimary);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(buttonPrimary2);
        layoutRow3.add(buttonPrimary3);
        layoutRow3.add(buttonPrimary4);
    }
}
