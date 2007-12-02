/**
 * AlcPopupMenu.java
 *
 * Created on November 27, 2007, 10:38 PM
 *
 * @author  Karl D.D. Willis
 * @version 1.0
 */

package alchemy.ui;

import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import javax.swing.border.Border;

public class AlcPopupMenu extends JPopupMenu{
    
    AlcToolBar parent;
    
    /** Creates a new instance of AlcPopupMenu */
    public AlcPopupMenu(AlcToolBar parent) {
        
        this.parent = parent;
        
        // Set the colour for the bg
        this.setBackground(parent.toolBarHighlightColour);
        
        
        Border outline = BorderFactory.createLineBorder(parent.toolBarLineColour, 1);
        Border empty = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        // Compound border combining the above two
        Border compound = BorderFactory.createCompoundBorder(outline, empty);
        this.setBorder(compound);
        
        
    }
    
}