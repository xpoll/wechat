<template>
  <div>
    <header>
      <div>
        <div class="logo"><img src="../assets/lm.png"></div>
      <!-- <img src="../../assets/sp/fold/Headphones.png"/> -->
        <div class="logo-name">千酌一梦醉独殇</div>
        <!--<div class="index-login">Login</div>-->
      </div>
    </header>
  </div>
</template>

<style type="text/css" lang="scss">
header {
  min-height: 80px;
  height: 80px;
  width: 100%;
  text-align: center;
  background-color: rgba(230, 56, 43, 0.5);
  z-index: 1;
}

header > div {
  min-width: 1200px;
  width: 1200px;
  padding: 8px 0;
  margin: 0 auto;
  height: 64px;
}

.logo {
  float: left;
}
.logo-name {
  float: left;
  line-height: 64px;
  font-size: x-large;
  color: #FFEB3B;
  letter-spacing: 2px;
}

.index-login{
  float: right;
  line-height: 50px;
  padding-right: 20px;
  height: 50px;
  top: 7px;
  width: 200px;
  cursor: pointer;

  color: rgba(255,255,255,1);
  background: rgba(255,255,255,0);
  -webkit-transition: all 0.5s;
  -moz-transition: all 0.5s;
  -o-transition: all 0.5s;
  transition: all 0.5s;
  border: 1px solid rgba(255,255,255,0.5);
  position: relative;
}
.index-login::before{
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  z-index: 1;
  opacity: 0;
  background-color: rgba(255,255,255,0.5);
  -webkit-transition: all 0.4s;
  -moz-transition: all 0.4s;
  -o-transition: all 0.4s;
  transition: all 0.4s;
  -webkit-transform: scale(0.5, 1);
  transform: scale(0.5, 1);
}
.index-login:hover::before{
  opacity: 1;
  -webkit-transform: scale(1, 1);
  transform: scale(1, 1);
}
</style>
