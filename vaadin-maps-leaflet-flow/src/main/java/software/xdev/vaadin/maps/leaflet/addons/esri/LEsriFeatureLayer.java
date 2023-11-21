package software.xdev.vaadin.maps.leaflet.addons.esri;

import com.vaadin.flow.component.UI;

import software.xdev.vaadin.maps.leaflet.layer.LGridLayer;
import software.xdev.vaadin.maps.leaflet.registry.LComponentManagementRegistry;

// @NpmPackage(value = "esri-leaflet", version = "3.0.11")
// @NpmPackage(value = "esri-leaflet-vector", version = "4.2.2")
// @JsModule("esri-leaflet/dist/esri-leaflet.js")
// @JsModule("esri-leaflet-vector/dist/esri-leaflet-vector.js")


public class LEsriFeatureLayer extends LGridLayer<LEsriFeatureLayer>
{
	
	public LEsriFeatureLayer(
		final LComponentManagementRegistry compReg,
		final LEsriFeatureLayerOptions options)
	{
		super(compReg, "L.esri.featureLayer(" + compReg.writeOptions(options).replace("\"url\"", "url") + ")");
		UI.getCurrent()
			.getPage()
			.addJsModule("https://cdn.jsdelivr.net/npm/esri-leaflet@3.0.11/dist/esri-leaflet.min.js");
		System.out.println("L.esri.featureLayer(" + compReg.writeOptions(options).replace("\"url\"", "url") + ")");
	}
}
