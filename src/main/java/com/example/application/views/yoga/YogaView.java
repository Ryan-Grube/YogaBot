package com.example.application.views.yoga;

import com.example.application.Calculations;
import com.example.application.poses.Pose;
import com.example.application.vcamera.VCamera;
import com.example.application.views.MainLayout;
import com.example.application.views.myposes.MyPosesView;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import org.vaadin.lineawesome.LineAwesomeIcon;

@PageTitle("Yoga")
@Route(value = "my-Yoga", layout = MainLayout.class)
@Uses(Icon.class)
public class YogaView extends Composite<VerticalLayout> {
    private static Pose pose;
    private static String toFix;
    private static Paragraph message = new Paragraph("");


    public YogaView() {


        HorizontalLayout layoutRow = new HorizontalLayout();
        layoutRow.setWidthFull();
        H2 h2 = new H2();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();//left text col



        VerticalLayout layoutColumn5 = new VerticalLayout();
        layoutColumn5.setSizeUndefined();
        VerticalLayout layoutColumn3 = new VerticalLayout();// right col text?

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
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);

        if(pose!=null){
            h2.setText(pose.getPoseName());
        }
        else {
            h2.setText("No Current Pose");
        }
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h2);
        h2.setWidth("max-content");
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidthFull();
        layoutColumn2.setHeight("500px");
        String msg = "";
        if(Calculations.getEs()!=null){
            for(int i =0; i<Calculations.getEs().getError().length; i++ ){
                msg += Calculations.getEs().getError()[i].getErrorMessage();
            }
        }
        message.setText(msg);
        message.setWidth("100%");
        message.getStyle().set("font-size", "var(--lumo-font-size-xs)");
        //layoutColumn5.setWidth("474px");
        //layoutColumn5.setHeight("344px");

        layoutColumn3.setWidth("320px");
        layoutColumn3.setHeightFull();
        layoutColumn6.setWidth("300px");
        layoutColumn6.setHeight("200px");
        layoutColumn4.setWidthFull();
        layoutColumn3.setFlexGrow(1.0, layoutColumn4);
        layoutColumn4.setWidth("100%");
        layoutColumn4.setHeight("50px");
        layoutColumn4.setJustifyContentMode(JustifyContentMode.CENTER);
        layoutColumn4.setAlignItems(Alignment.BASELINE);
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
        buttonPrimary2.setText("Flip");

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
        layoutColumn2.add(message);


        layoutRow2.add(layoutColumn5);
        layoutRow2.add(layoutColumn3);
        layoutColumn3.add(layoutColumn6);
        layoutColumn3.add(layoutColumn4);
        layoutColumn4.add(new SideNavItem("More Poses", MyPosesView.class, LineAwesomeIcon.PENCIL_RULER_SOLID.create()));
        layoutColumn4.setAlignItems(Alignment.CENTER);
        layoutColumn3.add(layoutRow3);
        layoutRow3.add(buttonPrimary2);
        layoutRow3.add(buttonPrimary3);
        layoutRow3.add(buttonPrimary4);

        layoutColumn5.setWidthFull();
        layoutColumn5.setHeightFull();
        layoutColumn3.setHeightFull();


        VCamera camera = new VCamera();
        camera.openCamera();
        layoutColumn5.add(camera);
        Image correctPoseImg;
        if(pose == null){
            correctPoseImg =  new Image("/images/yogaMan.png","Oh No");
        }
        else {
            correctPoseImg = new Image(pose.getImg(),"Oh No");
        }
        correctPoseImg.setHeight(layoutColumn6.getHeight());
        correctPoseImg.setWidth(layoutColumn6.getWidth());

        layoutColumn6.add(correctPoseImg);
        buttonPrimary2.addClickListener(event-> {pose.reverse();
                            getElement().executeJs("window.location.reload()");} );



    }

    public static void addToFix(String append){
        toFix += append;
    }

    public static void setPose(Pose pose2){
        pose = pose2;
    }
    public static Pose getPose() {
        return pose;
    }
    public static void setMessage(String msg){
        message.setText(msg);
    }
}

