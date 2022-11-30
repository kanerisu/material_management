package models.validators;

import java.util.ArrayList;
import java.util.List;

import actions.views.ItemView;
import actions.views.Items_MaterialsView;
import constants.MessageConst;
import services.ItemService;

/**
 * アイテムインスタンスに設定されている値のバリデーションを行うクラス
 *
 */

public class ItemValidator {

    /**
     * アイテムインスタンスの各項目についてバリデーションを行う
     * @param service 呼び出し元のserviceクラスのインスタンス
     * @param iv ItemViewのインスタンス
     * @return エラーのリスト
     */
    public static List<String> validate(
            ItemService service,ItemView iv,Items_MaterialsView imv){
        List<String> errors=new ArrayList<String>();

        //アイテム名のチェック
        String nameError=validateName(iv.getName());
        if(!nameError.equals("")) {
            errors.add(nameError);
        }

        //写真のチェック
        String pictureError=validatePicture(iv.getPicture());
        if(!pictureError.equals("")) {
            errors.add(pictureError);
        }

      //割合のチェック
        String percentageError=validatePercentage(imv.getPercentage());
        if(!percentageError.equals("")) {
            errors.add(percentageError);
        }
        return errors;

    }

    /**
     * アイテム名に入力値があるかチェックし入力値がなければエラーメッセージを返却
     * @param name アイテム名
     * @return エラーメッセージ
     */
    private static String validateName(String name) {

        if(name==null || name.equals("")) {
            return MessageConst.E_NONAME.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";

    }

    /**
     * 写真に入力値があるかチェックし入力値がなければエラーメッセージを返却
     * @param picture 写真
     * @return エラーメッセージ
     */
    private static String validatePicture(String picture) {

        if(picture==null || picture.equals("")) {
            return MessageConst.E_NOPICTURE.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

    /**
     * 割合に入力値があるかチェックし、入力値がなければエラーメッセージを返却
     * @param percentage 割合
     * @return エラーメッセージ
     */
    private static String validatePercentage(Integer percentage) {
        if(percentage==null || percentage.equals("")) {
            return MessageConst.E_NOPERCENTAGE.getMessage();
        }

        //入力値がある場合は空文字を返却
        return "";
    }

}
