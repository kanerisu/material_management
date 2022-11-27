package constants;

/**
 * 画面の項目値等を定義するEnumクラス
 *
 */

public enum AttributeConst {

    //フラッシュメッセージ
    FLUSH("flush"),

    //一覧画面共通
    MAX_ROW("maxRow"),
    PAGE("page"),

    //入力フォーム共通
    TOKEN("_token"),
    ERR("errors"),

    //アイテム
    ITEM("item"),
    ITEMS("items"),
    ITE_COUNT("item_count"),
    ITE_ID("id"),
    ITE_NAME("name"),
    ITE_PICTURE("picture"),

    //素材
    MATERIAL("material"),
    MATERIALS("materials"),
    MAT_COUNT("material_count"),
    MAT_ID("id"),
    MAT_MATERIAL_NAME("material_name"),
    MAT_CONTENT("content_msg"),

    //中間テーブル
    ITEM_MATERIAL("item_material"),
    ITEMS_MATERIALS("items_materials"),
    ITE_MAT_ID("id"),
    ITE_MAT_ITE_ID("items_id"),
    ITE_MAT_MAT_ID("materials_id"),
    ITE_MAT_PERCENTAGE("percentage");

    private final String text;
    private final Integer i;

    private AttributeConst(final String text) {
        this.text=text;
        this.i=null;
    }

    private AttributeConst(final Integer i) {
        this.text=null;
        this.i=i;
    }

    public String getValue() {
        return this.text;
    }

    public Integer getIntegerValue() {
        return this.i;
    }

}
