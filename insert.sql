INSERT INTO `mst_category` 
(category_name, category_description) 
VALUES 
 ('管楽器', '管楽器です。'),
 ('打楽器', '打楽器です。'), 
 ('弦楽器', '弦楽器です。'), 
 ('その他', 'その他の楽器です。')
;
 INSERT INTO mst_product
 (product_name, product_name_kana, product_description, category_id, price, image_full_path,release_date,release_company) 
 VALUES 
  ('ホルン', 'ほるん', 'ホルンです。', 1, 330000, '/img/wind_instrument/horn.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('トランペット', 'とらんぺっと', 'トランペットです。', 1, 88000, '/img/wind_instrument/trumpet.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('チューバ', 'ちゅーば', 'チューバです。',1, 275000, '/img/wind_instrument/tuba.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('トロンボーン', 'とろんぼーん', 'トロンボーンです。',1, 220000, '/img/wind_instrument/trombone.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ドラム', 'どらむ', 'ドラムです。', 2, 46200, '/img/percussion_instrument/drum.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ティンパニ', 'てぃんぱに', 'ティンパニです。', 2, 363000, '/img/percussion_instrument/timpani.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('タンバリン', 'たんばりん', 'タンバリンです。', 2, 2200, '/img/percussion_instrument/tambourine.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('シンバル', 'しんばる', 'シンバルです。', 2, 13200, '/img/percussion_instrument/cymbal.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('バイオリン', 'ばいおりん', 'バイオリンです。', 3, 66000, '/img/stringed_instrument/violin.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('チェロ', 'ちぇろ', 'チェロです。', 3, 275000, '/img/stringed_instrument/cello.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ギター', 'ぎたー', 'エレキギターです。', 3, 22000, '/img/stringed_instrument/guitar.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ベース', 'べーす', 'ベースです。', 3, 25300, '/img/stringed_instrument/bass.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ピアノ', 'ぴあの', 'ピアノです。', 4, 110000, '/img/other_instrument/piano.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('リコーダー', 'りこーだー', 'リコーダーです。', 4, 2200, '/img/other_instrument/recorder.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('EWI', 'いーうぃ', 'EWIです。', 4, 60000, '/img/other_instrument/EWI.jpg', '2021/07/08', 'ミュージックカンパニー' ),
  ('ハーモニカ', 'はーもにか', 'ハーモニカです。', 4, 1650, '/img/other_instrument/harmonica.jpg', '2021/07/08', 'ミュージックカンパニー' )
  ;