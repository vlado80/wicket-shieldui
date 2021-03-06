/*
 * A Wicket panel for the top menu shared between websites
 */
package com.shieldui.wicket.examples;

import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuPanel extends Panel
{
    private static final long serialVersionUID = 1L;
    
    public MenuPanel(String id)
    {
        super(id);
        
        add(new BookmarkablePageLink("home", HomePage.class));
        add(new BookmarkablePageLink("bar", BarDemos.class));
        add(new BookmarkablePageLink("bubble", BubbleDemos.class));
        add(new BookmarkablePageLink("range", RangeDemos.class));
        add(new BookmarkablePageLink("step", StepDemos.class));
        add(new BookmarkablePageLink("polar", PolarDemos.class));
        
        add(new BookmarkablePageLink("barcode", Barcode.class));
        add(new BookmarkablePageLink("qrcode", QrCode.class));
        
        add(new BookmarkablePageLink("button", Button.class));
        add(new BookmarkablePageLink("progressbar", ProgressBar.class));
        add(new BookmarkablePageLink("calendar", Calendar.class));
        
    }
}
