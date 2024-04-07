package com.example.application.views.dashboard;


import com.example.application.views.MainLayout;
import com.example.application.views.myposes.MyPosesView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.component.html.Image;

import java.awt.*;

@PageTitle("DashboardView")
@Route( value = "my-Dashboard", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class DashboardView extends Composite<VerticalLayout> {

    public DashboardView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        HorizontalLayout vert1 = new HorizontalLayout();
        getContent().add(vert1);
        Button button1 = new Button("Do Yoga!");
        RouterLink link1 = new RouterLink("", MyPosesView.class);
        button1.addClickListener(event->Notification.show("Here are some Yoga poses!\n Click on one and it will " +
                "take you to the Yoga player!") );
        link1.add(button1);
        vert1.add(link1);
        Image lemogus = new Image("/images/CameraTest.png","Oh No");
        vert1.add(lemogus);
        Button button2 = new Button("More Info!");

        vert1.setAlignItems(FlexComponent.Alignment.CENTER);
    }
}
