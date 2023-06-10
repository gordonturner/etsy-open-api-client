

# ListingVideo

Reference urls and metadata for a video associated with a specific listing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**videoId** | **Long** | The unique ID of a video associated with a listing. |  [optional]
**height** | **Long** | The video height dimension in pixels. |  [optional]
**width** | **Long** | The video width dimension in pixels. |  [optional]
**thumbnailUrl** | **String** | The url of the video thumbnail. |  [optional]
**videoUrl** | **String** | The url of the video file. |  [optional]
**videoState** | [**VideoStateEnum**](#VideoStateEnum) | The current state of a given video. Value is one of &#x60;active&#x60;, &#x60;inactive&#x60;, &#x60;deleted&#x60; or &#x60;flagged&#x60;. |  [optional]



## Enum: VideoStateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;
DELETED | &quot;deleted&quot;
FLAGGED | &quot;flagged&quot;



