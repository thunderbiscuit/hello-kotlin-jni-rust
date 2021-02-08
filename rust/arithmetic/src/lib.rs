use std::ffi::{CString, CStr};

use jni::objects::{JClass, JObject, JString};
use jni::JNIEnv;
use jni::sys::{jint, jstring};


// use jni::objects::{JObject, JString};
// use jni::sys::{jstring};

#[no_mangle]
pub extern "system" fn Java_org_acmecalculators_calculator_Calculator_nativeAdd(
    _env: JNIEnv, _class: JClass, a: jint, b: jint) -> jint {
    a + b
}


#[no_mangle]
pub unsafe extern fn Java_org_acmecalculators_calculator_Calculator_nativeHello(
  _env: JNIEnv,
  _: JObject, 
  j_recipient: JString
) -> jstring {
  let recipient = CString::from(
      CStr::from_ptr(
          _env.get_string(j_recipient).unwrap().as_ptr()
      )
  );

  let output = _env.new_string("Hello ".to_owned() + recipient.to_str().unwrap()).unwrap();
  output.into_inner()
}