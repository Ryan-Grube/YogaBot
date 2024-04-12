package com.example.application.views;

import com.example.application.views.yoga.YogaView;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("dynamic-text")
public class DynamicTextComponent extends VerticalLayout {

    public DynamicTextComponent() {
        // Create a label to display the text
        Paragraph textLabel = new Paragraph("Initial Text");

        // Create a button to trigger text change
//        Button changeTextButton = new Button();
//        changeTextButton.addClickListener(e -> {
//            // Change text using JavaScript
//            UI.getCurrent().getPage().executeJs("document.getElementById('textLabel').innerText = '%f'", YogaView.getChanges());
//        });

        // Set an ID for the label
        textLabel.setId("textLabel");

        // Add the components to the layout
//        add(textLabel, changeTextButton);
    }

    private void changeText(String newText) {
        // Execute JavaScript to change the text
        UI.getCurrent().getPage().executeJs(
                "document.getElementById('textLabel').innerText = $0", newText);
    }
}
