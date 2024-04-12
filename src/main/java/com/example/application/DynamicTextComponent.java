package com.example.application;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("dynamic-text")
public class DynamicTextComponent extends VerticalLayout {

    private Text textLabel;

    public DynamicTextComponent() {
        // Create a label to display the text
        textLabel = new Text("Initial Text");

        // Set an ID for the label
        textLabel.setId("textLabel");

        // Add the label to the layout
        add(textLabel);
    }

    private void changeText(String newText) {
        // Execute JavaScript to change the text
        UI.getCurrent().getPage().executeJs(
                "document.getElementById('textLabel').innerText = $0", newText);
    }

    // Example method that automatically triggers text change
    public void exampleMethod() {
        // Call changeText with a certain parameter
        changeText("New Text from exampleMethod");

        // Your method logic here...
    }

    // Another example method
    public void anotherMethod() {
        // Call changeText with a different parameter
        changeText("New Text from anotherMethod");

        // Your method logic here...
    }
}

