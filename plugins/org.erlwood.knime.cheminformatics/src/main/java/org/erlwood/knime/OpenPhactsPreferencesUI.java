/*
 * ------------------------------------------------------------------------
 *
 * Copyright (C) 2014 Eli Lilly and Company Limited
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * ------------------------------------------------------------------------
*/
package org.erlwood.knime;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OpenPhactsPreferencesUI extends FieldEditorPreferencePage
    implements IWorkbenchPreferencePage {
    
    
   public OpenPhactsPreferencesUI() {
        super(GRID);
        
    }

    private void addField(String name, String title) {
    	super.addField(new StringFieldEditor(name, title, getFieldEditorParent()));
    }
    
    /** {@inheritDoc} */
    @Override
    protected void createFieldEditors() {
    	    	
    	addField(CheminformaticsActivator.OPEN_PHACTS_URL, 		"OpenPhacts URL Endpoint");    	 
    	addField(CheminformaticsActivator.OPEN_PHACTS_APP_ID, 	"Application Id");
    	addField(CheminformaticsActivator.OPEN_PHACTS_APP_KEY, 	"Application Key");
     
   }

    /**
     * {@inheritDoc}
     */
    public void init(final IWorkbench workbench) {
    	setPreferenceStore(WebServiceCoreActivator.getDefault().getPreferenceStore());
        setDescription("OpenPhacts Preferences");
    }
	
}
