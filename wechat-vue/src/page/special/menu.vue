<template>
  <div>
    <nav>
      <input id='link-top' type='checkbox'>
      <label class='down' for='link-top'>
      <h2>Menu</h2>
      </label>
      <ul>
        <li>
          <input id='link-shop' type='checkbox'>
          <label class='right' for='link-shop'>Special effects</label>
          <ul>
            <li>
              <a href='#/sp/neon'>霓虹灯效果</a>
            </li>
            <li>
              <a href='#/sp/box'>阴影</a>
            </li>
            <li>
              <a href='#/sp/particle'>粒子写入</a>
            </li>
            <li>
              <a href='#/sp/atmo'>大气科技感粒子</a>
            </li>
            <li>
              <a href='#/sp/fold'>扁平化竖直折叠功能菜单</a>
            </li>
            <li>
              <a href='#/sp/btn'>按钮</a>
            </li>
          </ul>
        </li>
        <li>
          <a>Blog</a>
        </li>
        <li>
          <a>About</a>
        </li>
        <li>
          <a>Contact</a>
        </li>
      </ul>
    </nav>
  </div>
</template>

<style type="text/css" lang="scss">

*:focus {
  outline: none !important;
}

nav {
  position: relative;
  opacity: 0;
  -webkit-animation: bounceInUp 1000ms linear 500ms forwards;
          animation: bounceInUp 1000ms linear 500ms forwards;
}
nav label, nav a {
  -webkit-transition: all 150ms ease-out;
  transition: all 150ms ease-out;
  cursor: pointer;
  display: -webkit-box;
  display: -ms-flexbox;
  display: flex;
  -webkit-box-align: center;
      -ms-flex-align: center;
          align-items: center;
  -ms-flex-line-pack: center;
      align-content: center;
  height: 48px;
  width: 216px;
  padding: 0 12px;
  background: white;
  border: 2px solid #A6ADA7;
  border-radius: 2px;
  font-size: 18px;
  font-weight: 600;
  letter-spacing: -1px;
  background-color: rgba(0, 0, 0, 0.2);
}
nav a:hover, nav a:focus {
  border-color: #d0ddd1;
}
nav a:active {
  border-color: #F5C8BF;
}
nav label {
  position: relative;
}
nav label:before, nav label:after {
  -webkit-transition: all 150ms ease-out;
  transition: all 150ms ease-out;
  content: "";
  display: block;
  position: absolute;
  width: 2px;
  height: 12px;
  background: #A6ADA7;
  border-radius: 2px;
}
nav label:before {
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
}
nav label:after {
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
}
nav label.down:before, nav label.down:after {
  -webkit-transform-origin: center 11px;
          transform-origin: center 11px;
  top: 50%;
  margin-top: -6px;
  right: 20px;
}
nav label.right:before, nav label.right:after {
  -webkit-transform-origin: left center;
          transform-origin: left center;
  top: 50%;
  right: 20px;
}
nav label.right:before {
  margin-top: -9px;
}
nav label.right:after {
  margin-top: -3px;
}
nav > label {
  -webkit-transform: translateZ(1px);
          transform: translateZ(1px);
  z-index: 1;
}
nav ul {
  will-change: visibility;
  -webkit-transition: visibility 0ms ease-out 600ms;
  transition: visibility 0ms ease-out 600ms;
  visibility: hidden;
  z-index: 1;
}
nav ul li {
  list-style: none;
  will-change: transform, opacity;
  padding: 4px 0;
  opacity: 0;
}
nav ul li:nth-child(1) {
  -webkit-transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
}
nav ul li:nth-child(2) {
  -webkit-transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
}
nav ul li:nth-child(3) {
  -webkit-transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
}
nav ul li:nth-child(4) {
  -webkit-transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
}
nav ul li:nth-child(5) {
  -webkit-transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
}
nav > ul {
  position: relative;
  padding-top: 4px;
}
nav > ul > li {
  -webkit-transform: translateY(-100%);
          transform: translateY(-100%);
}
nav > ul > li > label {
  -webkit-transform: translateZ(0.5px);
          transform: translateZ(0.5px);
}
nav > ul ul {
  position: absolute;
  list-style: none;
  top: 0;
  left: 260px;
}
nav > ul ul > li {
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
nav input {
  cursor: pointer;
  -webkit-appearance: none;
     -moz-appearance: none;
          appearance: none;
  opacity: 0;
  position: absolute;
  width: 216px;
  height: 48px;
  margin: 0;
}
nav input:hover ~ label, nav input:focus ~ label {
  border-color: #d0ddd1;
}
nav input:active ~ label {
  border-color: #F5C8BF;
}
nav input:checked ~ label {
  border-color: #AEBFAF;
}
nav input:checked ~ label.down:before, nav input:checked ~ label.down:after {
  margin-top: -16px;
}
nav input:checked ~ label.down:before {
  -webkit-transform: rotate(-135deg);
          transform: rotate(-135deg);
}
nav input:checked ~ label.down:after {
  -webkit-transform: rotate(135deg);
          transform: rotate(135deg);
}
nav input:checked ~ label.right:before {
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  margin-top: -11px;
}
nav input:checked ~ label.right:after {
  -webkit-transform: rotate(-45deg);
          transform: rotate(-45deg);
  margin-top: -2px;
}
nav input:checked ~ ul {
  visibility: visible;
  -webkit-transition: visibility 0ms ease-out 0ms;
  transition: visibility 0ms ease-out 0ms;
}
nav input:checked ~ ul > li {
  opacity: 1;
  -webkit-transform: none;
          transform: none;
}
nav input:checked ~ ul > li:nth-child(1) {
  -webkit-transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
}
nav input:checked ~ ul > li:nth-child(2) {
  -webkit-transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
}
nav input:checked ~ ul > li:nth-child(3) {
  -webkit-transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
}
nav input:checked ~ ul > li:nth-child(4) {
  -webkit-transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
}
nav input:checked ~ ul > li:nth-child(5) {
  -webkit-transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
}
nav > input {
  z-index: 2;
  top: 0;
  left: 0;
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li {
  opacity: 0;
  -webkit-transform: translateX(-100%);
          transform: translateX(-100%);
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li:nth-child(1) {
  -webkit-transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms, opacity 100ms ease-out 500ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 500ms;
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li:nth-child(2) {
  -webkit-transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms, opacity 100ms ease-out 400ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 400ms;
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li:nth-child(3) {
  -webkit-transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms, opacity 100ms ease-out 300ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 300ms;
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li:nth-child(4) {
  -webkit-transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms, opacity 100ms ease-out 200ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 200ms;
}
nav > input:not(:checked) ~ ul > li input:checked ~ ul li:nth-child(5) {
  -webkit-transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms;
  transition: transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms, opacity 100ms ease-out 100ms, -webkit-transform 150ms cubic-bezier(0, 0.5, 0.5, 1.1) 100ms;
}

/* https://goo.gl/1h4kf5 */
@-webkit-keyframes bounceInUp {
  0% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 200, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 200, 0, 1);
    opacity: 0;
  }
  5.51% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 95.356, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 95.356, 0, 1);
  }
  11.01% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 23.691, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 23.691, 0, 1);
  }
  16.52% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -9.467, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -9.467, 0, 1);
  }
  21.92% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -16.994, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -16.994, 0, 1);
  }
  36.24% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -3.682, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -3.682, 0, 1);
    opacity: 1;
  }
  50.55% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1.004, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1.004, 0, 1);
  }
  79.08% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -0.059, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -0.059, 0, 1);
  }
  100% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
    opacity: 1;
  }
}
@keyframes bounceInUp {
  0% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 200, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 200, 0, 1);
    opacity: 0;
  }
  5.51% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 95.356, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 95.356, 0, 1);
  }
  11.01% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 23.691, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 23.691, 0, 1);
  }
  16.52% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -9.467, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -9.467, 0, 1);
  }
  21.92% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -16.994, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -16.994, 0, 1);
          }
  36.24% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -3.682, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -3.682, 0, 1);
    opacity: 1;
  }
  50.55% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1.004, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1.004, 0, 1);
  }
  79.08% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -0.059, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -0.059, 0, 1);
  }
  100% {
    -webkit-transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
            transform: matrix3d(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
    opacity: 1;
  }
}
</style>
