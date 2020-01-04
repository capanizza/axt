package com.company.axt.web.screens.categoria;

import com.haulmont.cuba.gui.screen.*;
import com.company.axt.entity.Categoria;

@UiController("axt_Categoria.browse")
@UiDescriptor("categoria-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class CategoriaBrowse extends MasterDetailScreen<Categoria> {
}