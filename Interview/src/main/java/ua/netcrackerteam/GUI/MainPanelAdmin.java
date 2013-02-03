/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.netcrackerteam.GUI;

import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

/**
 * Panel for Admin view
 * @author Anna Kushnirenko
 */
public class MainPanelAdmin extends MainPanel {
    private VerticalLayout mainPageLo;
    private VerticalLayout hrSettingsLo;
    private VerticalLayout interSettingsLo;
    private VerticalLayout settingsLo;
    
    public MainPanelAdmin(HeaderLayout hlayout) {
        super(hlayout);
        hlayout.setStyleName("user");
        hlayout.setHeight("130");
        mainPageLo = new VerticalLayout();
        mainPageLo.addComponent(richText);
        VerticalLayout layout = getClearField();
        layout.setStyleName("user");
        setContent(layout);
        TabSheet tabSheet = new TabSheet();
        layout.addComponent(tabSheet);
        tabSheet.addTab(mainPageLo,"Главная");
        hrSettingsLo = new VerticalLayout();
        fillHRSetLayout();
        tabSheet.addTab(hrSettingsLo, "Настройки HR");
        interSettingsLo = new VerticalLayout();
        fillInterSetLayout();
        tabSheet.addTab(interSettingsLo, "Настройки интервьюеров");
        settingsLo = new VerticalLayout();
        fillSetLayout();
        tabSheet.addTab(settingsLo, "Настройки администратора");
    }

    private void fillHRSetLayout() {
        
    }

    private void fillInterSetLayout() {
        
    }

    private void fillSetLayout() {
        
    }
    
}