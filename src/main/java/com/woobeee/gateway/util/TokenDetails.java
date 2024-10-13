package com.woobeee.gateway.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TokenDetails implements Serializable {
	private String email;
	private List<String> auths;
	private Long memberId;
}
