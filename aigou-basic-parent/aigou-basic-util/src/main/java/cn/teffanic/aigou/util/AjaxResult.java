package cn.teffanic.aigou.util;

public class AjaxResult {
    private Boolean success = true;
    private String msg = "操作成功";
    private Object data;

    public AjaxResult() {
    }

    public AjaxResult(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public AjaxResult(Boolean success, String msg, Object data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public AjaxResult(Object data) {
        this.data = data;
    }

    public static AjaxResult success(){
        return new AjaxResult();
    }
    public static AjaxResult success(Object data){
        return new AjaxResult(data);
    }
    public static AjaxResult fail(){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setSuccess(false);
        ajaxResult.setMsg("操作失败");
        return ajaxResult;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
