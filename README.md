# Welcome to My Project

<svg fill="none" viewBox="0 0 600 300" width="600" height="300" xmlns="http://www.w3.org/2000/svg">
  <foreignObject width="100%" height="100%">
    <div xmlns="http://www.w3.org/1999/xhtml">
      <style>
        @keyframes wave  {
            0% { transform: rotate( 0.0deg) }
           10% { transform: rotate(14.0deg) }
           20% { transform: rotate(-8.0deg) }
           30% { transform: rotate(14.0deg) }
           40% { transform: rotate(-4.0deg) }
           50% { transform: rotate(10.0deg) }
           60% { transform: rotate( 0.0deg) }
          100% { transform: rotate( 0.0deg) }
        }

        @keyframes gradient {
          0% {
            background-position: 0% 50%;
          }
          50% {
            background-position: 100% 50%;
          }
          100% {
            background-position: 0% 50%;
          }
        }

        .container {
          --color-main: #5452ee;
          --color-primary: #e73c7e;
          --color-secondary: #23a6d5;
          --color-tertiary: #ffff;

          background: linear-gradient(-45deg, var(--color-main), var(--color-primary), var(--color-secondary), var(--color-tertiary));
          background-size: 400% 400%;
          animation: gradient 15s ease infinite;

          width: 100%;
          height: 300px;

          display: flex;
          justify-content: center;
          align-items: center;
          color: white;

          font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol";
        }

        .wave {
          animation: wave 1.5s linear -0.5s infinite;
          display: inline-block;
          transform-origin: 70% 70%;
        }

        @media (prefers-color-scheme: light) {
          .container {
            --color-main: #F15BB5;
            --color-primary: #24b0ef;
            --color-secondary: #4526f6;
            --color-tertiary: #f6f645;
          }
        }

        @media (prefers-reduced-motion) {
          .container {
            animation: none;
          }

          .wave {
            animation: none;
          }
        }
      </style>

      <div class="container">
        <h1>Welcome to My Project <div class="wave">👋</div></h1>
      </div>
    </div>
  </foreignObject>
</svg>

## About This Project

This project is designed to demonstrate the use of animations in a README file. By using SVG and CSS, we can create engaging and interactive elements that enhance the user experience.

## Features

- Animated greeting
- Responsive design
- Easy to integrate into any project

## How to Use

To use this animated greeting in your own project, simply copy and paste the SVG code into your README.md file.

```markdown
<svg fill="none" viewBox="0 0 600 300" width="600" height="300" xmlns="http://www.w3.org/2000/svg">
  <foreignObject width="100%" height="100%">
    <div xmlns="http://www.w3.org/1999/xhtml">
      <!-- Your animated content goes here -->
    </div>
  </foreignObject>
</svg>
