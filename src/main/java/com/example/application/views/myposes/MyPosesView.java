package com.example.application.views.myposes;

import com.example.application.poses.Pose;
import com.example.application.poses.PoseSet;
import com.example.application.views.MainLayout;
import com.example.application.views.yoga.YogaView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

import static com.example.application.views.yoga.YogaView.setPose;

@PageTitle("My Poses")
@Route(value = "my-Poses", layout = MainLayout.class)
@Uses(Icon.class)
public class MyPosesView extends Composite<VerticalLayout> {

    public MyPosesView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();

        layoutRow.setHeight("150px");
        layoutRow2.setHeight("150px");


        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        getContent().add(layoutRow2);
        getContent().add(layoutRow3);

        makeClickableImage("/images/bridgePose.png",PoseSet.getBridgePose(),layoutRow);
        makeClickableImage("/images/catPose.png",PoseSet.getCatPose(),layoutRow);
        makeClickableImage("/images/cowPose.png",PoseSet.getCowPose(),layoutRow);
        makeClickableImage("/images/childsPose.png",PoseSet.getChildsPose(),layoutRow);
        makeClickableImage("/images/cobraPose.png",PoseSet.getCobraPose(),layoutRow2);
        makeClickableImage("/images/camelPose.png",PoseSet.getCamelPose(),layoutRow2);
        makeClickableImage("/images/downwardDog.png",PoseSet.getDownwardDog(),layoutRow3);
        makeClickableImage("/images/extendedSideAnglePose.png",PoseSet.getExtendedSideAnglePose(),layoutRow2);



    }
    public void makeClickableImage(String img, Pose pose,HorizontalLayout layout){
        RouterLink link2 = new RouterLink("", YogaView.class);
        Image myImage = new Image(img,"image not working");
        myImage.setHeight("150px");
        myImage.setWidth("250px");
        myImage.addClickListener(event ->
                {
                    link2.getElement().executeJs("this.click()");
                    setPose(pose);
                }
        );

        link2.add(myImage);
        layout.add(link2);

    }
}
