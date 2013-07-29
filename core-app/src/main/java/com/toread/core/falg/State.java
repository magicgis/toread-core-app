package com.toread.core.falg;

/**
 * @author 黎志兵
 * 状态枚举
 */
public enum State {
	
	/**禁用*/
	DISABLE(true,1),
	/**启用*/
	Enabled(true,0);
	private Boolean isAble;
	private Integer falg;
	private State(Boolean isAble, Integer falg) {
		this.isAble = isAble;
		this.falg = falg;
	}
	
	public Boolean getIsAble() {
		return isAble;
	}
	public Integer getFalg() {
		return falg;
	}
}
