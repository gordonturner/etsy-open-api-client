

# ListingImage

Reference urls and metadata for an image associated with a specific listing. The `url_fullxfull` parameter contains the URL for full-sized binary image file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**listingId** | **Integer** | The numeric ID for the [listing](/documentation/reference#tag/ShopListing) associated to this transaction. | 
**listingImageId** | **Integer** | The numeric ID of the primary [listing image](/documentation/reference#tag/ShopListing-Image) for this transaction. | 
**hexCode** | **String** | The webhex string for the image&#39;s average color, in webhex notation. | 
**red** | **Integer** | The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color). | 
**green** | **Integer** | The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color). | 
**blue** | **Integer** | The numeric red value equal to the image&#39;s average red value, from 0-255 (RGB color). | 
**hue** | **Integer** | The numeric hue equal to the image&#39;s average hue, from 0-360 (HSV color). | 
**saturation** | **Integer** | The numeric saturation equal to the image&#39;s average saturation, from 0-100 (HSV color). | 
**brightness** | **Integer** | The numeric brightness equal to the image&#39;s average brightness, from 0-100 (HSV color). | 
**isBlackAndWhite** | **Boolean** | When true, the image is in black &amp; white. | 
**creationTsz** | **Integer** | The listing image\\&#39;s creation time, in epoch seconds. | 
**rank** | **Integer** | The positive non-zero numeric position in the images displayed in a listing, with rank 1 images appearing in the left-most position in a listing. | 
**url75x75** | **String** | The url string for a 75x75 pixel thumbnail of the image. | 
**url170x135** | **String** | The url string for a 170x135 pixel thumbnail of the image. | 
**url570xN** | **String** | The url string for a thumbnail of the image, no more than 570 pixels wide with variable height. | 
**urlFullxfull** | **String** | The url string for the full-size image, up to 3000 pixels in each dimension. | 
**fullHeight** | **Integer** | The numeric height, measured in pixels, of the full-sized image referenced in url_fullxfull. | 
**fullWidth** | **Integer** | The numeric width, measured in pixels, of the full-sized image referenced in url_fullxfull. | 



