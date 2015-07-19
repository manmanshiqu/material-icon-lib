package net.steamcrafted.materialiconlib;

/**
 * Created by Wannes2 on 19/07/2015.
 */
import android.content.Context;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/**
 * Embed an icon into a Drawable that can be used as TextView icons, or ActionBar icons.
 * <p/>
 * <pre>
 *     new IconDrawable(context, IconValue.icon_star)
 *           .colorRes(R.color.white)
 *           .actionBarSize();
 * </pre>
 * If you don't set the size of the drawable, it will use the size
 * that is given to him. Note that in an ActionBar, if you don't
 * set the size explicitly it uses 0, so please use actionBarSize().
 */
public class MaterialDrawableBuilder {

    public static enum IconValue {ACCOUNT,ACCOUNT_ALERT,ACCOUNT_BOX,ACCOUNT_BOX_OUTLINE,ACCOUNT_CHECK,ACCOUNT_CIRCLE,ACCOUNT_KEY,ACCOUNT_LOCATION,ACCOUNT_MINUS,ACCOUNT_MULTIPLE,ACCOUNT_MULTIPLE_OUTLINE,ACCOUNT_MULTIPLE_PLUS,ACCOUNT_NETWORK,ACCOUNT_OUTLINE,ACCOUNT_PLUS,ACCOUNT_REMOVE,ACCOUNT_SEARCH,ACCOUNT_STAR,ACCOUNT_STAR_VARIANT,ACCOUNT_SWITCH,AIRBALLOON,AIRPLANE,AIRPLANE_OFF,ALARM,ALARM_CHECK,ALARM_MULTIPLE,ALARM_OFF,ALARM_PLUS,ALBUM,ALERT,ALERT_BOX,ALERT_CIRCLE,ALERT_OCTAGON,ALPHA,ALPHABETICAL,AMAZON,AMAZON_CLOUDDRIVE,AMBULANCE,ANDROID,ANDROID_DEBUG_BRIDGE,ANDROID_STUDIO,APPLE,APPLE_FINDER,APPLE_MOBILEME,APPLE_SAFARI,APPNET, APPS, ARCHIVE,ARRANGE_BRING_FORWARD,ARRANGE_BRING_TO_FRONT,ARRANGE_SEND_BACKWARD,ARRANGE_SEND_TO_BACK,ARROW_ALL,ARROW_BOTTOM_LEFT,ARROW_BOTTOM_RIGHT,ARROW_COLLAPSE,ARROW_DOWN,ARROW_DOWN_BOLD,ARROW_DOWN_BOLD_CIRCLE,ARROW_DOWN_BOLD_CIRCLE_OUTLINE,ARROW_DOWN_BOLD_HEXAGON_OUTLINE,ARROW_EXPAND,ARROW_LEFT,ARROW_LEFT_BOLD,ARROW_LEFT_BOLD_CIRCLE,ARROW_LEFT_BOLD_CIRCLE_OUTLINE,ARROW_LEFT_BOLD_HEXAGON_OUTLINE,ARROW_RIGHT,ARROW_RIGHT_BOLD,ARROW_RIGHT_BOLD_CIRCLE,ARROW_RIGHT_BOLD_CIRCLE_OUTLINE,ARROW_RIGHT_BOLD_HEXAGON_OUTLINE,ARROW_TOP_LEFT,ARROW_TOP_RIGHT,ARROW_UP,ARROW_UP_BOLD,ARROW_UP_BOLD_CIRCLE,ARROW_UP_BOLD_CIRCLE_OUTLINE,ARROW_UP_BOLD_HEXAGON_OUTLINE,AT,ATTACHMENT,AUDIOBOOK,AUTO_FIX,AUTO_UPLOAD,BACKBURGER,BACKUP_RESTORE,BANK,BARCODE,BARLEY,BARREL,BASECAMP,BASKET,BASKET_FILL,BASKET_UNFILL,BATTERY,BATTERY_20,BATTERY_30,BATTERY_40,BATTERY_60,BATTERY_80,BATTERY_90,BATTERY_ALERT,BATTERY_CHARGING_100,BATTERY_CHARGING_20,BATTERY_CHARGING_30,BATTERY_CHARGING_40,BATTERY_CHARGING_60,BATTERY_CHARGING_80,BATTERY_CHARGING_90,BATTERY_MINUS,BATTERY_NEGATIVE,BATTERY_OUTLINE,BATTERY_PLUS,BATTERY_POSITIVE,BATTERY_UNKNOWN,BEACH,BEAKER,BEAKER_EMPTY,BEAKER_EMPTY_OUTLINE,BEAKER_OUTLINE,BEATS,BEER,BEHANCE,BELL,BELL_OFF,BELL_OUTLINE,BELL_RING,BELL_RING_OUTLINE,BELL_SLEEP,BETA,BIKE,BING,BINOCULARS,BIO,BIOHAZARD,BLACK_MESA,BLACKBERRY,BLINDS,BLOCK_HELPER,BLOGGER,BLUETOOTH,BLUETOOTH_AUDIO,BLUETOOTH_CONNECT,BLUETOOTH_SETTINGS,BLUR,BLUR_LINEAR,BLUR_OFF,BLUR_RADIAL,BONE,BOOK,BOOK_MULTIPLE,BOOK_MULTIPLE_VARIANT,BOOK_OPEN,BOOK_VARIANT,BOOKMARK,BOOKMARK_CHECK,BOOKMARK_MUSIC,BOOKMARK_OUTLINE,BOOKMARK_OUTLINE_PLUS,BOOKMARK_PLUS,BOOKMARK_REMOVE,BORDER_ALL,BORDER_BOTTOM,BORDER_COLOR,BORDER_HORIZONTAL,BORDER_INSIDE,BORDER_LEFT,BORDER_NONE,BORDER_OUTSIDE,BORDER_RIGHT,BORDER_TOP,BORDER_VERTICAL,BOWLING,BOX,BRIEFCASE,BRIEFCASE_CHECK,BRIEFCASE_DOWNLOAD,BRIEFCASE_UPLOAD,BRIGHTNESS_1,BRIGHTNESS_2,BRIGHTNESS_3,BRIGHTNESS_4,BRIGHTNESS_5,BRIGHTNESS_6,BRIGHTNESS_7,BRIGHTNESS_AUTO,BROOM,BRUSH,BUG,BULLHORN,BUS,CAKE,CAKE_VARIANT,CALCULATOR,CALENDAR,CALENDAR_BLANK,CALENDAR_CHECK,CALENDAR_CLOCK,CALENDAR_MULTIPLE,CALENDAR_MULTIPLE_CHECK,CALENDAR_PLUS,CALENDAR_REMOVE,CALENDAR_TEXT,CALENDAR_TODAY,CAMCORDER,CAMCORDER_BOX,CAMCORDER_BOX_OFF,CAMCORDER_OFF,CAMERA,CAMERA_IRIS,CAMERA_PARTY_MODE,CAMERA_SWITCH,CAMERA_TIMER,CANDYCANE,CAR,CAR_WASH,CARROT,CART,CART_OUTLINE,CASH,CASH_MULTIPLE,CASH_USD,CAST,CAST_CONNECTED,CASTLE,CAT,CELLPHONE,CELLPHONE_ANDROID,CELLPHONE_DOCK,CELLPHONE_IPHONE,CELLPHONE_LINK,CELLPHONE_LINK_OFF,CELLPHONE_SETTINGS,CHAIR_SCHOOL,CHART_ARC,CHART_AREASPLINE,CHART_BAR,CHART_HISTOGRAM,CHART_LINE,CHART_PIE,CHECK,CHECK_ALL,CHECKBOX_BLANK,CHECKBOX_BLANK_CIRCLE,CHECKBOX_BLANK_CIRCLE_OUTLINE,CHECKBOX_BLANK_OUTLINE,CHECKBOX_MARKED,CHECKBOX_MARKED_CIRCLE,CHECKBOX_MARKED_CIRCLE_OUTLINE,CHECKBOX_MARKED_OUTLINE,CHECKBOX_MULTIPLE_BLANK,CHECKBOX_MULTIPLE_BLANK_OUTLINE,CHECKBOX_MULTIPLE_MARKED,CHECKBOX_MULTIPLE_MARKED_OUTLINE,CHECKERBOARD,CHEVRON_DOUBLE_DOWN,CHEVRON_DOUBLE_LEFT,CHEVRON_DOUBLE_RIGHT,CHEVRON_DOUBLE_UP,CHEVRON_DOWN,CHEVRON_LEFT,CHEVRON_RIGHT,CHEVRON_UP,CHURCH,CISCO_WEBEX,CITY,CLIPBOARD,CLIPBOARD_ACCOUNT,CLIPBOARD_ALERT,CLIPBOARD_ARROW_DOWN,CLIPBOARD_ARROW_LEFT,CLIPBOARD_CHECK,CLIPBOARD_OUTLINE,CLIPBOARD_TEXT,CLIPPY,CLOCK,CLOCK_FAST,CLOSE,CLOSE_BOX,CLOSE_BOX_OUTLINE,CLOSE_CIRCLE,CLOSE_CIRCLE_OUTLINE,CLOSE_NETWORK,CLOSED_CAPTION,CLOUD,CLOUD_CHECK,CLOUD_CIRCLE,CLOUD_DOWNLOAD,CLOUD_OUTLINE,CLOUD_OUTLINE_OFF,CLOUD_UPLOAD,CODE_ARRAY,CODE_STRING,CODEPEN,COFFEE,COFFEE_TO_GO,COIN,COLOR_HELPER,COMMENT,COMMENT_ACCOUNT,COMMENT_ACCOUNT_OUTLINE,COMMENT_ALERT,COMMENT_ALERT_OUTLINE,COMMENT_CHECK,COMMENT_CHECK_OUTLINE,COMMENT_MULTIPLE_OUTLINE,COMMENT_OUTLINE,COMMENT_PLUS_OUTLINE,COMMENT_PROCESSING,COMMENT_PROCESSING_OUTLINE,COMMENT_REMOVE_OUTLINE,COMMENT_TEXT,COMMENT_TEXT_OUTLINE,COMPARE,COMPASS,COMPASS_OUTLINE,CONSOLE,CONTENT_COPY,CONTENT_CUT,CONTENT_PASTE,CONTENT_SAVE,CONTENT_SAVE_ALL,CONTRAST,CONTRAST_BOX,CONTRAST_CIRCLE,COW,CREDIT_CARD,CREDIT_CARD_MULTIPLE,CROP,CROP_FREE,CROP_LANDSCAPE,CROP_PORTRAIT,CROP_SQUARE,CROSSHAIRS,CROSSHAIRS_GPS,CROWN,CUBE,CUBE_OUTLINE,CUBE_UNFOLDED,CUP,CUP_WATER,CURRENCY_BTC,CURRENCY_EUR,CURRENCY_GBP,CURRENCY_INR,CURRENCY_RUB,CURRENCY_TRY,CURRENCY_USD,CURSOR_DEFAULT,CURSOR_DEFAULT_OUTLINE,CURSOR_MOVE,CURSOR_POINTER,DATABASE,DATABASE_MINUS,DATABASE_OUTLINE,DATABASE_PLUS,DEBUG_STEP_INTO,DEBUG_STEP_OUT,DEBUG_STEP_OVER,DELETE,DELETE_VARIANT,DESKPHONE,DESKTOP_MAC,DESKTOP_TOWER,DETAILS,DEVIANTART,DICE,DICE_1,DICE_2,DICE_3,DICE_4,DICE_5,DICE_6,DIRECTIONS,DISK_ALERT,DISQUS,DISQUS_OUTLINE,DIVISION,DIVISION_BOX,DNS,DOMAIN,DOTS_HORIZONTAL,DOTS_VERTICAL,DOWNLOAD,DRAG,DRAG_HORIZONTAL,DRAG_VERTICAL,DRAWING,DRAWING_BOX,DRIBBBLE,DRIBBBLE_BOX,DRONE,DROPBOX,DUCK,DUMBBELL,EARTH,EARTH_OFF,EDGE,ELEVATION_DECLINE,ELEVATION_RISE,ELEVATOR,EMAIL,EMAIL_OPEN,EMAIL_OUTLINE,EMOTICON,EMOTICON_COOL,EMOTICON_DEVIL,EMOTICON_HAPPY,EMOTICON_NEUTRAL,EMOTICON_POOP,EMOTICON_SAD,EMOTICON_TONGUE,EQUAL,EQUAL_BOX,ERASER,ESCALATOR,ETSY,EVERNOTE,EXCLAMATION,EXIT_TO_APP,EXPORT,EYE,EYE_OFF,EYEDROPPER,EYEDROPPER_VARIANT,FACEBOOK,FACEBOOK_BOX,FACEBOOK_MESSENGER,FACTORY,FAN,FAST_FORWARD,FERRY,FILE,FILE_CLOUD,FILE_DELIMITED,FILE_DOCUMENT,FILE_DOCUMENT_BOX,FILE_EXCEL,FILE_EXCEL_BOX,FILE_FIND,FILE_IMAGE,FILE_IMAGE_BOX,FILE_MUSIC,FILE_OUTLINE,FILE_PDF,FILE_PDF_BOX,FILE_POWERPOINT,FILE_POWERPOINT_BOX,FILE_PRESENTATION_BOX,FILE_VIDEO,FILE_WORD,FILE_WORD_BOX,FILE_XML,FILM,FILMSTRIP,FILMSTRIP_OFF,FILTER,FILTER_OUTLINE,FILTER_REMOVE,FILTER_REMOVE_OUTLINE,FILTER_VARIANT,FIRE,FIREFOX,FISH,FLAG,FLAG_CHECKERED,FLAG_OUTLINE,FLAG_OUTLINE_VARIANT,FLAG_TRIANGLE,FLAG_VARIANT,FLASH,FLASH_AUTO,FLASH_OFF,FLASHLIGHT,FLASHLIGHT_OFF,FLATTR,FLIP_TO_BACK,FLIP_TO_FRONT,FLOPPY,FLOWER,FOLDER,FOLDER_ACCOUNT,FOLDER_DOWNLOAD,FOLDER_GOOGLE_DRIVE,FOLDER_IMAGE,FOLDER_LOCK,FOLDER_LOCK_OPEN,FOLDER_MOVE,FOLDER_MULTIPLE,FOLDER_MULTIPLE_IMAGE,FOLDER_MULTIPLE_OUTLINE,FOLDER_OUTLINE,FOLDER_PLUS,FOLDER_REMOVE,FOLDER_UPLOAD,FOOD,FOOD_APPLE,FOOD_VARIANT,FOOTBALL,FOOTBALL_HELMET,FORMAT_ALIGN_CENTER,FORMAT_ALIGN_JUSTIFY,FORMAT_ALIGN_LEFT,FORMAT_ALIGN_RIGHT,FORMAT_BOLD,FORMAT_CLEAR,FORMAT_COLOR_FILL,FORMAT_HEADER_1,FORMAT_HEADER_2,FORMAT_HEADER_3,FORMAT_HEADER_4,FORMAT_HEADER_5,FORMAT_HEADER_6,FORMAT_HEADER_POUND,FORMAT_INDENT_DECREASE,FORMAT_INDENT_INCREASE,FORMAT_ITALIC,FORMAT_LINE_SPACING,FORMAT_LIST_BULLETED,FORMAT_LIST_NUMBERS,FORMAT_PAINT,FORMAT_PARAGRAPH,FORMAT_QUOTE,FORMAT_SIZE,FORMAT_STRIKETHROUGH,FORMAT_SUBSCRIPT,FORMAT_SUPERSCRIPT,FORMAT_TEXT,FORMAT_TEXTDIRECTION_L_TO_R,FORMAT_TEXTDIRECTION_R_TO_L,FORMAT_UNDERLINE,FORUM,FORWARD,FOURSQUARE,FRIDGE,FULLSCREEN,FULLSCREEN_EXIT,FUNCTION,GAMEPAD,GAMEPAD_VARIANT,GAS_STATION,GAVEL,GENDER_FEMALE,GENDER_MALE,GENDER_MALE_FEMALE,GENDER_TRANSGENDER,GIFT,GITHUB_BOX,GITHUB_CIRCLE,GLASS_FLUTE,GLASS_MUG,GLASS_STANGE,GLASS_TULIP,GMAIL,GOOGLE,GOOGLE_CHROME,GOOGLE_CIRCLES,GOOGLE_CIRCLES_COMMUNITIES,GOOGLE_CIRCLES_EXTENDED,GOOGLE_CIRCLES_GROUP,GOOGLE_CONTROLLER,GOOGLE_CONTROLLER_OFF,GOOGLE_DRIVE,GOOGLE_EARTH,GOOGLE_GLASS,GOOGLE_MAPS,GOOGLE_PAGES,GOOGLE_PLAY,GOOGLE_PLUS,GOOGLE_PLUS_BOX,GRID,GRID_OFF,GUITAR_PICK,GUITAR_PICK_OUTLINE,HAND_POINTING_RIGHT,HANGER,HANGOUTS,HARDDISK,HEADPHONES,HEADPHONES_BOX,HEADPHONES_SETTINGS,HEADSET,HEADSET_DOCK,HEADSET_OFF,HEART,HEART_BOX,HEART_BOX_OUTLINE,HEART_BROKEN,HEART_OUTLINE,HELP,HELP_CIRCLE,HEXAGON,HEXAGON_OUTLINE,HISTORY,HOLOLENS,HOME,HOME_MODERN,HOME_VARIANT,HOPS,HOSPITAL,HOSPITAL_BUILDING,HOSPITAL_MARKER,HOTEL,HOUZZ,HOUZZ_BOX,HUMAN,HUMAN_CHILD,HUMAN_MALE_FEMALE,IMAGE_ALBUM,IMAGE_AREA,IMAGE_AREA_CLOSE,IMAGE_BROKEN,IMAGE_FILTER,IMAGE_FILTER_BLACK_WHITE,IMAGE_FILTER_CENTER_FOCUS,IMAGE_FILTER_DRAMA,IMAGE_FILTER_FRAMES,IMAGE_FILTER_HDR,IMAGE_FILTER_NONE,IMAGE_FILTER_TILT_SHIFT,IMAGE_FILTER_VINTAGE,IMPORT,INBOX,INFORMATION,INFORMATION_OUTLINE,INSTAGRAM,INSTAPAPER,INTERNET_EXPLORER,INVERT_COLORS,JIRA,KEG,KEY,KEY_CHANGE,KEY_MINUS,KEY_PLUS,KEY_REMOVE,KEY_VARIANT,KEYBOARD,KEYBOARD_BACKSPACE,KEYBOARD_CAPS,KEYBOARD_CLOSE,KEYBOARD_OFF,KEYBOARD_RETURN,KEYBOARD_TAB,KEYBOARD_VARIANT,LABEL,LABEL_OUTLINE,LANGUAGE_CSHARP,LANGUAGE_CSS3,LANGUAGE_HTML5,LANGUAGE_JAVASCRIPT,LANGUAGE_PYTHON,LANGUAGE_PYTHON_TEXT,LAPTOP,LAPTOP_CHROMEBOOK,LAPTOP_MAC,LAPTOP_WINDOWS,LASTFM,LAUNCH,LAYERS,LAYERS_OFF,LEAF,LIBRARY,LIBRARY_BOOKS,LIBRARY_MUSIC,LIBRARY_PLUS,LIGHTBULB,LIGHTBULB_OUTLINE,LINK,LINK_VARIANT,LINKEDIN,LINKEDIN_BOX,LINUX,LOCK,LOCK_OPEN,LOCK_OPEN_OUTLINE,LOCK_OUTLINE,LOGIN,LOGOUT,LOOKS,LOUPE,LUMX,MAGNIFY,MAGNIFY_MINUS,MAGNIFY_PLUS,MAP,MAP_MARKER,MAP_MARKER_CIRCLE,MAP_MARKER_MULTIPLE,MAP_MARKER_OFF,MAP_MARKER_RADIUS,MARGIN,MARKDOWN,MARKER_CHECK,MARTINI,MATERIAL_UI,MATH_COMPASS,MAXCDN,MEMORY,MENU,MENU_DOWN,MENU_LEFT,MENU_RIGHT,MENU_UP,MESSAGE,MESSAGE_ALERT,MESSAGE_DRAW,MESSAGE_IMAGE,MESSAGE_PROCESSING,MESSAGE_REPLY,MESSAGE_TEXT,MESSAGE_TEXT_OUTLINE,MESSAGE_VIDEO,MICROPHONE,MICROPHONE_OFF,MICROPHONE_OUTLINE,MICROPHONE_SETTINGS,MICROPHONE_VARIANT,MICROPHONE_VARIANT_OFF,MINUS,MINUS_BOX,MINUS_CIRCLE,MINUS_CIRCLE_OUTLINE,MINUS_NETWORK,MONITOR,MONITOR_MULTIPLE,MORE,MOTORBIKE,MOUSE,MOUSE_OFF,MOUSE_VARIANT,MOUSE_VARIANT_OFF,MOVIE,MULTIPLICATION,MULTIPLICATION_BOX,MUSIC_BOX,MUSIC_BOX_OUTLINE,MUSIC_CIRCLE,MUSIC_NOTE,MUSIC_NOTE_EIGHTH,MUSIC_NOTE_HALF,MUSIC_NOTE_OFF,MUSIC_NOTE_QUARTER,MUSIC_NOTE_SIXTEENTH,MUSIC_NOTE_WHOLE,NATURE,NATURE_PEOPLE,NAVIGATION,NEEDLE,NEST_PROTECT,NEST_THERMOSTAT,NEWSPAPER,NFC,NFC_TAP,NFC_VARIANT,NUMERIC,NUMERIC_0_BOX,NUMERIC_0_BOX_MULTIPLE_OUTLINE,NUMERIC_0_BOX_OUTLINE,NUMERIC_1_BOX,NUMERIC_1_BOX_MULTIPLE_OUTLINE,NUMERIC_1_BOX_OUTLINE,NUMERIC_2_BOX,NUMERIC_2_BOX_MULTIPLE_OUTLINE,NUMERIC_2_BOX_OUTLINE,NUMERIC_3_BOX,NUMERIC_3_BOX_MULTIPLE_OUTLINE,NUMERIC_3_BOX_OUTLINE,NUMERIC_4_BOX,NUMERIC_4_BOX_MULTIPLE_OUTLINE,NUMERIC_4_BOX_OUTLINE,NUMERIC_5_BOX,NUMERIC_5_BOX_MULTIPLE_OUTLINE,NUMERIC_5_BOX_OUTLINE,NUMERIC_6_BOX,NUMERIC_6_BOX_MULTIPLE_OUTLINE,NUMERIC_6_BOX_OUTLINE,NUMERIC_7_BOX,NUMERIC_7_BOX_MULTIPLE_OUTLINE,NUMERIC_7_BOX_OUTLINE,NUMERIC_8_BOX,NUMERIC_8_BOX_MULTIPLE_OUTLINE,NUMERIC_8_BOX_OUTLINE,NUMERIC_9_BOX,NUMERIC_9_BOX_MULTIPLE_OUTLINE,NUMERIC_9_BOX_OUTLINE,NUMERIC_9_PLUS_BOX,NUMERIC_9_PLUS_BOX_MULTIPLE_OUTLINE,NUMERIC_9_PLUS_BOX_OUTLINE,NUTRITON,OFFICE,OIL,OMEGA,ONEDRIVE,OPEN_IN_APP,OPEN_IN_NEW,ORNAMENT,ORNAMENT_VARIANT,OUTBOX,PACKAGE,PACKAGE_DOWN,PACKAGE_UP,PACKAGE_VARIANT,PACKAGE_VARIANT_CLOSED,PALETTE,PALETTE_ADVANCED,PANDA,PANDORA,PANORAMA,PANORAMA_FISHEYE,PANORAMA_HORIZONTAL,PANORAMA_VERTICAL,PANORAMA_WIDE_ANGLE,PAPER_CUT_VERTICAL,PAPERCLIP,PARKING,PAUSE,PAUSE_CIRCLE,PAUSE_CIRCLE_OUTLINE,PAUSE_OCTAGON,PAUSE_OCTAGON_OUTLINE,PEN,PENCIL,PENCIL_BOX,PENCIL_BOX_OUTLINE,PHARMACY,PHONE,PHONE_BLUETOOTH,PHONE_FORWARD,PHONE_HANGUP,PHONE_IN_TALK,PHONE_LOCKED,PHONE_MISSED,PHONE_PAUSED,PHONE_SETTINGS,PIG,PILL,PIN,PIN_OFF,PINE_TREE,PINE_TREE_BOX,PINTEREST,PINTEREST_BOX,PIZZA,PLAY,PLAY_BOX_OUTLINE,PLAY_CIRCLE,PLAY_CIRCLE_OUTLINE,PLAYLIST_MINUS,PLAYLIST_PLUS,PLAYSTATION,PLUS,PLUS_BOX,PLUS_CIRCLE,PLUS_CIRCLE_OUTLINE,PLUS_NETWORK,PLUS_ONE,POCKET,POLL,POLL_BOX,POLYMER,POPCORN,POUND,POUND_BOX,POWER,POWER_SETTINGS,PRESENTATION,PRESENTATION_PLAY,PRINTER,PRINTER_3D,PULSE,PUZZLE,QRCODE,QUADCOPTER,QUALITY_HIGH,QUICKTIME,RADIATOR,RADIO,RADIO_TOWER,RADIOACTIVE,RADIOBOX_BLANK,RADIOBOX_MARKED,RASPBERRYPI,RDIO,READ,READABILITY,RECEIPT,RECYCLE,REDO,REDO_VARIANT,REFRESH,RELATIVE_SCALE,RELOAD,REMOTE,RENAME_BOX,REPEAT,REPEAT_OFF,REPEAT_ONCE,REPLAY,REPLY,REPLY_ALL,REPRODUCTION,RESIZE_BOTTOM_RIGHT,RESPONSIVE,REWIND,RIBBON,ROCKET,ROTATE_3D,ROTATE_LEFT,ROTATE_LEFT_VARIANT,ROTATE_RIGHT,ROTATE_RIGHT_VARIANT,ROUTES,RSS,RSS_BOX,RULER,RUN,SATELLITE,SATELLITE_VARIANT,SCALE,SCALE_BATHROOM,SCHOOL,SCREEN_ROTATION,SCREEN_ROTATION_LOCK,SCRIPT,SD,SECURITY,SECURITY_NETWORK,SELECT,SELECT_ALL,SELECT_INVERSE,SELECT_OFF,SEND,SERVER,SERVER_MINUS,SERVER_NETWORK,SERVER_NETWORK_OFF,SERVER_OFF,SERVER_PLUS,SERVER_REMOVE,SERVER_SECURITY,SETTINGS,SETTINGS_BOX,SHAPE_PLUS,SHARE,SHARE_VARIANT,SHIELD,SHIELD_OUTLINE,SHOPPING,SHOPPING_MUSIC,SHUFFLE,SIGMA,SIGN_CAUTION,SILVERWARE,SILVERWARE_FORK,SILVERWARE_SPOON,SILVERWARE_VARIANT,SIM_ALERT,SKIP_NEXT,SKIP_PREVIOUS,SNAPCHAT,SNOWMAN,SORT,SORT_ALPHABETICAL,SORT_ASCENDING,SORT_DESCENDING,SORT_NUMERIC,SORT_VARIANT,SOUNDCLOUD,SOURCE_FORK,SOURCE_PULL,SPEAKER,SPEAKER_OFF,SPEEDOMETER,SPELLCHECK,SPOTIFY,SPOTLIGHT,SPOTLIGHT_BEAM,STACKOVERFLOW,STAR,STAR_CIRCLE,STAR_HALF,STAR_OUTLINE,STOCKING,STOP,STORE,STORE_24_HOUR,STOVE,SUBWAY,SWAP_HORIZONTAL,SWAP_VERTICAL,SWIM,SWORD,SYNC,SYNC_ALERT,SYNC_OFF,TAB,TAB_UNSELECTED,TABLE,TABLE_COLUMN_PLUS_AFTER,TABLE_COLUMN_PLUS_BEFORE,TABLE_COLUMN_REMOVE,TABLE_COLUMN_WIDTH,TABLE_EDIT,TABLE_LARGE,TABLE_ROW_HEIGHT,TABLE_ROW_PLUS_AFTER,TABLE_ROW_PLUS_BEFORE,TABLE_ROW_REMOVE,TABLET,TABLET_ANDROID,TABLET_IPAD,TAG,TAG_FACES,TAG_MULTIPLE,TAG_OUTLINE,TAG_TEXT_OUTLINE,TAXI,TELEVISION,TELEVISION_GUIDE,TEMPERATURE_CELSIUS,TEMPERATURE_FAHRENHEIT,TEMPERATURE_KELVIN,TENT,TERRAIN,TEXT_TO_SPEECH,TEXT_TO_SPEECH_OFF,TEXTURE,THEATER,THEME_LIGHT_DARK,THERMOMETER,THERMOMETER_LINES,THUMB_DOWN,THUMB_DOWN_OUTLINE,THUMB_UP,THUMB_UP_OUTLINE,THUMBS_UP_DOWN,TICKET,TICKET_ACCOUNT,TIE,TIMELAPSE,TIMER,TIMER_10,TIMER_3,TIMER_OFF,TIMER_SAND,TIMETABLE,TOGGLE_SWITCH,TOGGLE_SWITCH_OFF,TOOLTIP,TOOLTIP_EDIT,TOOLTIP_IMAGE,TOOLTIP_OUTLINE,TOOLTIP_OUTLINE_PLUS,TOOLTIP_TEXT,TOR,TRAFFIC_LIGHT,TRAIN,TRAM,TRANSCRIBE,TRANSCRIBE_CLOSE,TRANSFER,TREE,TRELLO,TRENDING_DOWN,TRENDING_NEUTRAL,TRENDING_UP,TROPHY,TROPHY_AWARD,TROPHY_VARIANT,TRUCK,TSHIRT_CREW,TSHIRT_V,TUMBLR,TUMBLR_REBLOG,TWITCH,TWITTER,TWITTER_BOX,TWITTER_RETWEET,UBUNTU,UNDO,UNDO_VARIANT,UNFOLD_LESS,UNFOLD_MORE,UNTAPPD,UPLOAD,USB,VECTOR_CURVE,VECTOR_POINT,VECTOR_SQUARE,VERIFIED,VIBRATE,VIDEO,VIDEO_OFF,VIDEO_SWITCH,VIEW_AGENDA,VIEW_ARRAY,VIEW_CAROUSEL,VIEW_COLUMN,VIEW_DASHBOARD,VIEW_DAY,VIEW_HEADLINE,VIEW_LIST,VIEW_MODULE,VIEW_QUILT,VIEW_STREAM,VIEW_WEEK,VIMEO,VK,VOICEMAIL,VOLUME_HIGH,VOLUME_LOW,VOLUME_MEDIUM,VOLUME_OFF,WALK,WALLET,WALLET_GIFTCARD,WALLET_MEMBERSHIP,WALLET_TRAVEL,WATCH,WATCH_EXPORT,WATCH_IMPORT,WATER,WATER_OFF,WATER_PUMP,WEATHER_CLOUDY,WEATHER_HAIL,WEATHER_LIGHTNING,WEATHER_NIGHT,WEATHER_PARTLYCLOUDY,WEATHER_POURING,WEATHER_RAINY,WEATHER_SNOWY,WEATHER_SUNNY,WEATHER_SUNSET,WEATHER_SUNSET_DOWN,WEATHER_SUNSET_UP,WEATHER_WINDY,WEATHER_WINDY_VARIANT,WEB,WEBCAM,WEIGHT,WEIGHT_KILOGRAM,WHATSAPP,WHEELCHAIR_ACCESSIBILITY,WHITE_BALANCE_AUTO,WHITE_BALANCE_INCANDESCENT,WHITE_BALANCE_IRRADESCENT,WHITE_BALANCE_SUNNY,WIFI,WII,WIKIPEDIA,WINDOW_CLOSE,WINDOW_CLOSED,WINDOW_MAXIMIZE,WINDOW_MINIMIZE,WINDOW_OPEN,WINDOW_RESTORE,WINDOWS,WORDPRESS,WORKER,WUNDERLIST,XBOX,XBOX_CONTROLLER,XBOX_CONTROLLER_OFF,XDA,XML,YEAST,YOUTUBE_PLAY,ZIP_BOX};

    public static final int ANDROID_ACTIONBAR_ICON_SIZE_DP = 24;

    private final Context context;

    private IconValue icon;

    private TextPaint paint;

    private int size = -1;

    private int alpha = 255;

    private MaterialDrawable mDrawable;

    private final Rect bounds = new Rect();

    /**
     * Create an IconDrawable.
     *
     * @param context Your activity or application context.
     */
    private MaterialDrawableBuilder(Context context) {
        this.context = context;
        //this.icon = icon;
        paint = new TextPaint();
        paint.setTypeface(MaterialIconUtils.getTypeFace(context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setUnderlineText(false);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
    }

    public static MaterialDrawableBuilder with(Context context){
        return new MaterialDrawableBuilder(context);
    }

    public MaterialDrawable build(){
        return new MaterialDrawable(context, icon, paint, size, alpha);
    }

    public MaterialDrawableBuilder setIcon(IconValue iconValue){
        icon = iconValue;
        return this;
    }

    /**
     * Set the size of this icon to the standard Android ActionBar.
     *
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setToActionbarSize() {
        return setSizeDp(ANDROID_ACTIONBAR_ICON_SIZE_DP);
    }

    /**
     * Set the size of the drawable.
     *
     * @param dimenRes The dimension resource.
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setSizeResource(int dimenRes) {
        return setSizePx(context.getResources().getDimensionPixelSize(dimenRes));
    }

    /**
     * Set the size of the drawable.
     *
     * @param size The size in density-independent pixels (dp).
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setSizeDp(int size) {
        return setSizePx(MaterialIconUtils.convertDpToPx(context, size));
    }

    /**
     * Set the size of the drawable.
     *
     * @param size The size in pixels (px).
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setSizePx(int size) {
        this.size = size;
        bounds.set(0, 0, size, size);
        return this;
    }

    /**
     * Set the color of the drawable.
     *
     * @param color The color, usually from android.graphics.Color or 0xFF012345.
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setColor(int color) {
        paint.setColor(color);
        return this;
    }

    /**
     * Set the color of the drawable.
     *
     * @param colorRes The color resource, from your R file.
     * @return The current IconDrawable for chaining.
     */
    public MaterialDrawableBuilder setColorResource(int colorRes) {
        paint.setColor(context.getResources().getColor(colorRes));
        return this;
    }

    public MaterialDrawableBuilder setAlpha(int alpha) {
        this.alpha = alpha;
        paint.setAlpha(alpha);
        return this;
    }

    public MaterialDrawableBuilder setColorFilter(ColorFilter cf) {
        paint.setColorFilter(cf);
        return this;
    }

    public MaterialDrawableBuilder clearColorFilter() {
        paint.setColorFilter(null);
        return this;
    }

    public int getOpacity() {
        return this.alpha;
    }

    /**
     * Sets paint style.
     *
     * @param style to be applied
     */
    public MaterialDrawableBuilder setStyle(Paint.Style style) {
        paint.setStyle(style);
        return this;
    }

    private class MaterialDrawable extends Drawable {
        private final Context context;
        private final IconValue icon;
        private TextPaint paint;
        private int size = -1;
        private int alpha = 255;

        /**
         * Create an IconDrawable.
         *
         * @param context Your activity or application context.
         * @param icon    The icon you want this drawable to display.
         */
        public MaterialDrawable(Context context, IconValue icon, TextPaint paint, int size, int alpha) {
            this.context = context;
            this.icon = icon;
            this.paint = paint;
            this.setSizePx(size);
            this.setAlpha(alpha);

            invalidateSelf();
        }

        /**
         * Set the size of the drawable.
         *
         * @param size The size in pixels (px).
         * @return The current IconDrawable for chaining.
         */
        public MaterialDrawable setSizePx(int size) {
            this.size = size;
            setBounds(0, 0, size, size);
            invalidateSelf();
            return this;
        }

        @Override
        public int getIntrinsicHeight() {
            return size;
        }

        @Override
        public int getIntrinsicWidth() {
            return size;
        }

        @Override
        public void draw(Canvas canvas) {
            paint.setTextSize(getBounds().height());
            Rect textBounds = new Rect();
            String textValue = MaterialIconView.getIconString(icon.ordinal());
            paint.getTextBounds(textValue, 0, 1, textBounds);
            float textBottom = (getBounds().height() - textBounds.height()) / 2f + textBounds.height() - textBounds.bottom;
            canvas.drawText(textValue, getBounds().width() / 2f, textBottom, paint);
        }

        @Override
        public boolean isStateful() {
            return true;
        }

        @Override
        public boolean setState(int[] stateSet) {
            int oldValue = paint.getAlpha();
            int newValue = alpha;//Utils.isEnabled(stateSet) ? alpha : alpha / 2;
            paint.setAlpha(newValue);
            return oldValue != newValue;
        }

        @Override
        public void setAlpha(int alpha) {
            this.alpha = alpha;
            paint.setAlpha(alpha);
        }

        @Override
        public void setColorFilter(ColorFilter cf) {
            paint.setColorFilter(cf);
        }

        @Override
        public void clearColorFilter() {
            paint.setColorFilter(null);
        }

        @Override
        public int getOpacity() {
            return this.alpha;
        }

        /**
         * Sets paint style.
         *
         * @param style to be applied
         */
        public void setStyle(Paint.Style style) {
            paint.setStyle(style);
        }

    }

}