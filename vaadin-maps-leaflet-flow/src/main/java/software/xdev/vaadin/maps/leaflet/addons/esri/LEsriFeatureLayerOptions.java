package software.xdev.vaadin.maps.leaflet.addons.esri;

import java.util.Date;

import software.xdev.vaadin.maps.leaflet.base.LComponentOptions;


public class LEsriFeatureLayerOptions
	implements LComponentOptions<LEsriFeatureLayerOptions>
{
	private String url;
	private String where;
	private Integer maxZoom;
	private Integer minZoom;
	private Boolean cacheLayers;
	private String[] fields;
	private Date from;
	private Date to;
	private String timeField;
	private Integer simplifyFactor;
	private Integer precision;
	private String apikey;
	private String token;
	private String proxy;
	private Boolean useCors;
	private String renderer;
	private Boolean isModern;
	private Boolean ignoreRenderer;
	private Boolean fetchAllFeatures;
	
	public LEsriFeatureLayerOptions(final String url)
	{
		this.url = url;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(final String url)
	{
		this.url = url;
	}
	
	public LEsriFeatureLayerOptions withUrl(final String url)
	{
		this.setUrl(url);
		return this.self();
	}
	
	public String getWhere()
	{
		return where;
	}
	
	public void setWhere(final String where)
	{
		this.where = where;
	}
	
	public LEsriFeatureLayerOptions withWhere(final String where)
	{
		this.setWhere(where);
		return this.self();
	}
	
	public int getMaxZoom()
	{
		return maxZoom;
	}
	
	public void setMaxZoom(final int maxZoom)
	{
		this.maxZoom = maxZoom;
	}
	
	public LEsriFeatureLayerOptions withMaxZoom(final int maxZoom)
	{
		this.setMaxZoom(maxZoom);
		return this.self();
	}
	
	public int getMinZoom()
	{
		return minZoom;
	}
	
	public void setMinZoom(final int minZoom)
	{
		this.minZoom = minZoom;
	}
	
	public LEsriFeatureLayerOptions withMinZoom(final int minZoom)
	{
		this.setMinZoom(minZoom);
		return this.self();
	}
	
	public boolean isCacheLayers()
	{
		return cacheLayers;
	}
	
	public void setCacheLayers(final boolean cacheLayers)
	{
		this.cacheLayers = cacheLayers;
	}
	
	public LEsriFeatureLayerOptions withCacheLayers(final boolean cacheLayers)
	{
		this.setCacheLayers(cacheLayers);
		return this.self();
	}
	
	public String[] getFields()
	{
		return fields;
	}
	
	public void setFields(final String[] fields)
	{
		this.fields = fields;
	}
	
	public LEsriFeatureLayerOptions withFields(final String[] fields)
	{
		this.setFields(fields);
		return this.self();
	}
	
	public Date getFrom()
	{
		return from;
	}
	
	public void setFrom(final Date from)
	{
		this.from = from;
	}
	
	public LEsriFeatureLayerOptions withFrom(final Date from)
	{
		this.setFrom(from);
		return this.self();
	}
	
	public Date getTo()
	{
		return to;
	}
	
	public void setTo(final Date to)
	{
		this.to = to;
	}
	
	public LEsriFeatureLayerOptions withTo(final Date to)
	{
		this.setTo(to);
		return this.self();
	}
	
	public String getTimeField()
	{
		return timeField;
	}
	
	public void setTimeField(final String timeField)
	{
		this.timeField = timeField;
	}
	
	public LEsriFeatureLayerOptions withTimeField(final String timeField)
	{
		this.setTimeField(timeField);
		return this.self();
	}
	
	public int getSimplifyFactor()
	{
		return simplifyFactor;
	}
	
	public void setSimplifyFactor(final int simplifyFactor)
	{
		this.simplifyFactor = simplifyFactor;
	}
	
	public LEsriFeatureLayerOptions withSimplifyFactor(final int simplifyFactor)
	{
		this.setSimplifyFactor(simplifyFactor);
		return this.self();
	}
	
	public int getPrecision()
	{
		return precision;
	}
	
	public void setPrecision(final int precision)
	{
		this.precision = precision;
	}
	
	public LEsriFeatureLayerOptions withPrecision(final int precision)
	{
		this.setPrecision(precision);
		return this.self();
	}
	
	public String getApikey()
	{
		return apikey;
	}
	
	public void setApikey(final String apikey)
	{
		this.apikey = apikey;
	}
	
	public LEsriFeatureLayerOptions withApiKey(final String apikey)
	{
		this.setApikey(apikey);
		return this.self();
	}
	
	public String getToken()
	{
		return token;
	}
	
	public void setToken(final String token)
	{
		this.token = token;
	}
	
	public LEsriFeatureLayerOptions withToken(final String token)
	{
		this.setToken(token);
		return this.self();
	}
	
	public String getProxy()
	{
		return proxy;
	}
	
	public void setProxy(final String proxy)
	{
		this.proxy = proxy;
	}
	
	public LEsriFeatureLayerOptions withProxy(final String proxy)
	{
		this.setProxy(proxy);
		return this.self();
	}
	
	public boolean isUseCors()
	{
		return useCors;
	}
	
	public void setUseCors(final boolean useCors)
	{
		this.useCors = useCors;
	}
	
	public LEsriFeatureLayerOptions withUseCors(final boolean useCors)
	{
		this.setUseCors(useCors);
		return this.self();
	}
	
	public String getRenderer()
	{
		return renderer;
	}
	
	public void setRenderer(final String renderer)
	{
		this.renderer = renderer;
	}
	
	public LEsriFeatureLayerOptions withRenderer(final String renderer)
	{
		this.setRenderer(renderer);
		return this.self();
	}
	
	public boolean isModern()
	{
		return isModern;
	}
	
	public void setModern(final boolean modern)
	{
		isModern = modern;
	}
	
	public LEsriFeatureLayerOptions withModern(final boolean modern)
	{
		this.setModern(modern);
		return this.self();
	}
	
	public boolean isIgnoreRenderer()
	{
		return ignoreRenderer;
	}
	
	public void setIgnoreRenderer(final boolean ignoreRenderer)
	{
		this.ignoreRenderer = ignoreRenderer;
	}
	
	public LEsriFeatureLayerOptions withIgnoreRenderer(final boolean ignoreRenderer)
	{
		this.setIgnoreRenderer(ignoreRenderer);
		return this.self();
	}
	
	public boolean isFetchAllFeatures()
	{
		return fetchAllFeatures;
	}
	
	public void setFetchAllFeatures(final boolean fetchAllFeatures)
	{
		this.fetchAllFeatures = fetchAllFeatures;
	}
	
	public LEsriFeatureLayerOptions withFetchAllFeatures(final boolean fetchAllFeatures)
	{
		this.setFetchAllFeatures(fetchAllFeatures);
		return this.self();
	}
}
