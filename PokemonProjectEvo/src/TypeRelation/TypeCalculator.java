package TypeRelation;


import java.util.Arrays;

public class TypeCalculator {



		private double relation = 1;
		public TypeCalculator(String aType, String defType1) {

			String[] defTypelist = {defType1};

			Arrays.stream(defTypelist).forEach(str -> {

				//くさタイプのこうげき
				if(aType == "くさ") {
					//こうかはばつぐん条件
					if(str == "みず" || str == "じめん" || str == "いわ") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "くさ" || str == "ほのお" || str == "ひこう" || str == "はがね" || str == "ドラゴン" || str == "どく" || str == "むし") {
						relation /= 2;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//ほのおタイプのこうげき
				else if(aType == "ほのお") {
					//こうかはばつぐん条件
					if(str == "くさ" || str == "むし" || str == "はがね" || str == "こおり") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "みず" || str == "ほのお" || str == "いわ" || str == "ドラゴン") {
						relation /= 2;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//みずタイプのこうげき
				else if(aType == "みず") {
					//こうかはばつぐん条件
					if(str == "ほのお" || str == "じめん" || str == "いわ"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "みず" || str == "くさ" || str == "ドラゴン") {
						relation /= 2;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//ノーマルタイプのこうげき
				else if(aType == "ノーマル") {
					//こうかはばつぐん条件

					//こうかはいまひとつ条件
					if(str == "いわ" || str == "はがね") {
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "ゴースト")  {
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//でんきタイプのこうげき
				else if(aType == "でんき") {
					//こうかはばつぐん条件
					if(str == "みず" || str == "ひこう") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "でんき" || str == "くさ" || str == "ドラゴン") {
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "じめん") {
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//こおりタイプのこうげき
				else if(aType == "こおり") {
					//こうかはばつぐん条件
					if(str == "くさ" || str == "ひこう" || str == "ドラゴン") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "みず" || str == "こおり" || str == "はがね" || str == "ほのお") {
						relation /= 2;
					}
					//こうかなし条件
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//かくとうタイプのこうげき
				else if(aType == "かくとう") {
					//こうかはばつぐん条件
					if(str == "いわ" || str == "こおり" || str == "ノーマル" || str == "はがね" || str == "あく") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "ひこう" || str == "エスパー" || str == "フェアリー" || str == "むし" || str == "どく"){
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "ゴースト"){
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//どくタイプのこうげき
				else if(aType == "どく") {
					//こうかはばつぐん条件
					if(str == "くさ" || str == "フェアリー"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "どく" || str == "じめん" || str == "いわ" || str == "ゴースト"){
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "はがね"){
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//じめんタイプのこうげき
				else if(aType == "じめん"){
					//こうかはばつぐん条件
					if(str == "ほのお" || str == "いわ" || str == "はがね" || str == "どく" || str == "でんき"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "くさ" || str == "むし") {
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "ひこう") {
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//ひこうタイプのこうげき
				else if(aType == "ひこう"){
					//こうかはばつぐん条件
					if(str == "くさ" || str == "むし" || str == "かくとう") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "でんき" || str == "いわ" || str == "はがね") {
						relation /= 2;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//エスパータイプのこうげき
				else if(aType == "エスパー") {
					//こうかはばつぐん条件
					if(str == "かくとう" || str == "どく"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "はがね" || str == "エスパー"){
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "あく"){
						relation *= 0;
 					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//むしタイプのこうげき
				else if(aType == "むし") {
					//こうかはばつぐん条件
					if(str == "くさ" || str == "エスパー" || str == "あく") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "はがね" || str == "ほのお" || str == "ひこう" || str == "どく" || str == "かくとう" || str == "フェアリー" || str == "ゴースト") {
						relation /= 2;
					}
					//こうかなし条件
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//いわタイプのこうげき
				else if(aType == "いわ"){
					//こうかはばつぐん条件
					if(str == "ほのお" || str == "むし" || str == "ひこう" || str == "こおり") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "はがね" || str == "かくとう" || str == "じめん") {
						relation /= 2;
					}
					//こうかなし条件
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//ゴーストタイプのこうげき
				else if(aType == "ゴースト") {
					//こうかはばつぐん条件
					if(str == "エスパー" || str == "ゴースト") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "あく"){
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "ノーマル") {
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//ドラゴンタイプのこうげき
				else if(aType == "ドラゴン") {
					//こうかはばつぐん条件
					if(str == "ドラゴン"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "はがね") {
						relation /= 2;
					}
					//こうかなし条件
					else if(str == "フェアリー") {
						relation *= 0;
					}
					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//はがねタイプのこうげき
				else if(aType == "はがね"){
					//こうかはばつぐん条件
					if(str == "いわ" || str == "こおり" || str == "フェアリー") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "はがね" || str == "ほのお" || str == "みず" || str == "でんき") {
						relation /= 2;
					}
					//こうかなし条件

					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//あくタイプのこうげき
				else if(aType == "あく") {
					//こうかはばつぐん条件
					if(str == "エスパー" || str == "ゴースト"){
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "あく" || str == "フェアリー" || str == "かくとう") {
						relation /= 2;
					}
					//こうかなし条件

					//こうかあり条件
					else {
						relation *= 1;
					}
				}
				//フェアリータイプのこうげき
				else if(aType == "フェアリー"){
					//こうかはばつぐん条件
					if(str == "かくとう" || str == "ドラゴン" || str == "あく") {
						relation *= 2;
					}
					//こうかはいまひとつ条件
					else if(str == "ほのお" || str == "どく" || str == "はがね") {
						relation /= 2;
					}
					//こうかなし条件

					//こうかあり条件
					else {
						relation *= 1;
					}
				}
			});

			//倍率のリターン
			if(relation >= 2) {
				System.out.println("こうかはばつぐんだ!!!");
			}
			else if(relation == 0) {
				System.out.println("こうかはないようだ...");
			}
			else if(relation < 1) {
				System.out.println("こうかはいまひとつのようだ...");
			}

		}

		public double getResult() {
			return relation;
		}
	}